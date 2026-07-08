package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19460811Bu extends PagerAdapter {
    public final Context LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final Function1<AbstractC1702680uPS, Unit> LLILZ;
    public InterfaceC2257101DWa LLILZIL;
    public final List<VideoPublishEditModel> LLILZLL = new ArrayList();
    public final Map<Integer, C19461011Bw> LLIZ = new LinkedHashMap();
    public boolean LLIZLLLIL = true;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    public final C19461011Bw LJJIJIL(int i) {
        return (C19461011Bw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        String string;
        String uniqueId;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.czy, viewGroup, false);
        viewGroup.addView(viewTd);
        UrlModel urlModel = null;
        if (!this.LLIZ.containsKey(Integer.valueOf(i))) {
            LifecycleOwner lifecycleOwner = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) ListProtector.get(this.LLILZLL, i);
            InterfaceC2257101DWa interfaceC2257101DWa = this.LLILZIL;
            if (interfaceC2257101DWa == null) {
                interfaceC2257101DWa = null;
            }
            this.LLIZ.put(Integer.valueOf(i), new C19461011Bw(viewTd, lifecycleOwner, videoPublishEditModel, interfaceC2257101DWa, this.LLILZ));
        }
        C19461011Bw c19461011Bw = (C19461011Bw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(i));
        if (c19461011Bw != null) {
            boolean z = this.LLIZLLLIL;
            C786410Ut5.Q7(c19461011Bw.LJIILIIL, new ACListenerS163S0100000_29(c19461011Bw, 220));
            C427310GpF c427310GpF = c19461011Bw.LJIILJJIL;
            VideoPublishEditModel videoPublishEditModel2 = c19461011Bw.LIZJ;
            Context context = c19461011Bw.LIZ.getContext();
            InterfaceC2257101DWa interfaceC2257101DWa2 = c19461011Bw.LIZLLL;
            MusicObject musicObject = videoPublishEditModel2.creativeModel.musicBuzModel.music;
            if (musicObject == null || (string = musicObject.musicName) == null) {
                string = context.getResources().getString(2131839040);
            }
            MusicObject musicObject2 = videoPublishEditModel2.creativeModel.musicBuzModel.music;
            if (musicObject2 == null || (uniqueId = musicObject2.authorName) == null) {
                if (interfaceC2257101DWa2 != null) {
                    uniqueId = interfaceC2257101DWa2.getUniqueId();
                } else {
                    uniqueId = "";
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append('-');
            sbLIZ.append(uniqueId);
            c427310GpF.setText(C2188811AlT.LIZIZ(sbLIZ));
            MusicObject musicObject3 = c19461011Bw.LIZJ.creativeModel.musicBuzModel.music;
            if (musicObject3 != null) {
                urlModel = musicObject3.coverThumb;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            int iLIZ = C341940Daq.LIZ(27.0d);
            int iLIZ2 = C341940Daq.LIZ(27.0d);
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZ2;
            c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
            c1331670kl3LJIIIIZZ.LJJ(c19461011Bw.LJIILL);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            c19461011Bw.LIZLLL();
            C1324840ka2.LJFF(c19461011Bw.LJIIL, c19461011Bw.LIZLLL.getAvatarMedium());
            TuxTextView tuxTextView = c19461011Bw.LJIJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('@');
            sbLIZ2.append(c19461011Bw.LIZLLL.getUniqueId());
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ2));
            if (!TextUtils.isEmpty(c19461011Bw.LIZJ.getTitle())) {
                C786410Ut5.LLLLZLL(c19461011Bw.LJIJI, 0);
                c19461011Bw.LJIJI.setText(c19461011Bw.LIZJ.getTitle());
            }
            if (!z) {
                c19461011Bw.LIZ().LIZLLL();
            }
        }
        this.LLIZLLLIL = false;
        return viewTd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19460811Bu(Context context, LifecycleOwner lifecycleOwner, Function1<? super AbstractC1702680uPS, Unit> function1) {
        this.LLILLJJLI = context;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = function1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C1441840nck c1441840nckLIZ;
        if (this.LLIZ.containsKey(Integer.valueOf(i))) {
            C19461011Bw c19461011Bw = (C19461011Bw) ((LinkedHashMap) this.LLIZ).get(Integer.valueOf(i));
            if (c19461011Bw != null && (c1441840nckLIZ = c19461011Bw.LIZ()) != null) {
                c1441840nckLIZ.LIZJ();
            }
            this.LLIZ.remove(Integer.valueOf(i));
        }
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }
}
