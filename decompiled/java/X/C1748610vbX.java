package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.component.alttext.AltTextViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748610vbX extends AbstractC2172971A2l<String, C1748630vbZ> {
    public final AltTextViewModel LLILLJJLI;
    public final Context LLILLL;
    public final List<SingleImageData> LLILZ;
    public final List<String> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC2172971A2l, X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZIL).size();
    }

    public C1748610vbX(AltTextViewModel altTextViewModel, Context context) {
        super(new AbstractC339510DSr<String>() { // from class: X.0vba
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(String str, String str2) {
                return Intrinsics.LJFF(str, str2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(String str, String str2) {
                return Intrinsics.LJFF(str, str2);
            }
        });
        this.LLILLJJLI = altTextViewModel;
        this.LLILLL = context;
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        int length;
        C1748630vbZ c1748630vbZ = (C1748630vbZ) viewHolder;
        SingleImageData singleImageData = (SingleImageData) ListProtector.get(this.LLILZ, i);
        String str = (String) ListProtector.get(this.LLILZIL, i);
        c1748630vbZ.getClass();
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(singleImageData.getSrcImageInfo().getPath()));
        c1331670kl3LJII.LJJIJL(c1748630vbZ.LLILLJJLI);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        c1331670kl3LJII.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJII.LJIIIZ = iLIZIZ2;
        c1331670kl3LJII.LJJ(c1748630vbZ.LLILLL);
        c1331670kl3LJII.LJJ = EnumC1338240kve.CENTER_CROP;
        C786410Ut5.h3(c1331670kl3LJII);
        c1748630vbZ.LLILZ.removeTextChangedListener(c1748630vbZ.LLILZLL);
        C0I7D c0i7d = c1748630vbZ.LLILZ;
        if (str == null) {
            str = "";
        }
        c0i7d.setText(str);
        c1748630vbZ.LLILZ.addTextChangedListener(c1748630vbZ.LLILZLL);
        C1748330vb5 c1748330vb5 = c1748630vbZ.LLILZIL;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(c1748630vbZ.LLILZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhn83ImYMTDPTsmamgDkfPXLMYnNSBr0VbDeBtHp/k76Q=", null));
        if (editableLLLLJI != null) {
            length = editableLLLLJI.length();
        } else {
            length = 0;
        }
        c1748330vb5.LLJJI = length;
        c1748330vb5.LLJJIII = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        c1748330vb5.LIZ();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1748630vbZ c1748630vbZ = new C1748630vbZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cuj, viewGroup, false), this.LLILLJJLI, this.LLILLL);
        try {
            View view = c1748630vbZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1748630vbZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1748630vbZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1748630vbZ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1748630vbZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1748630vbZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1748630vbZ.class.getName();
        return c1748630vbZ;
    }
}
