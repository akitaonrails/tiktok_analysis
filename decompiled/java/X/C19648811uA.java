package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19648811uA extends PagerAdapter {
    public final Context LLILLJJLI;
    public final List<SingleImageData> LLILLL;
    public final int LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final Function1<Boolean, Unit> LLILZLL;
    public boolean LLIZ;
    public InterfaceC19649011uC LLIZLLLIL;
    public final ImageSynthesisResult[] LLJ;
    public final C1322110kVd[] LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    public static final void LJJIJIL(C1322110kVd c1322110kVd, InterfaceC1320380kSq interfaceC1320380kSq) {
        if (c1322110kVd.hasHierarchy()) {
            c1322110kVd.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
            return;
        }
        C1331090kk7 c1331090kk7 = new C1331090kk7(C20642515q3.LJFF());
        c1331090kk7.LJIIL = interfaceC1320380kSq;
        c1322110kVd.setHierarchy(c1331090kk7.LIZ());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(final int i, ViewGroup viewGroup) {
        String path;
        C1322110kVd c1322110kVd = new C1322110kVd(this.LLILLJJLI);
        C786410Ut5.c7(c1322110kVd, new ViewGroup.LayoutParams(-1, -1));
        LJJIJIL(c1322110kVd, InterfaceC1320380kSq.LIZJ);
        if (C1417210mz1.LIZIZ(this.LLILZIL)) {
            ImageSynthesisResult imageSynthesisResult = (ImageSynthesisResult) C13LQ.LJJIIZ(i, this.LLJ);
            if (imageSynthesisResult == null || (path = imageSynthesisResult.getPath()) == null) {
                path = ((SingleImageData) ListProtector.get(this.LLILLL, i)).getSynthesisPathAsPossible();
            }
        } else {
            path = ((SingleImageData) ListProtector.get(this.LLILLL, i)).getSrcImageInfo().getPath();
        }
        int i2 = this.LLILZ;
        C1324750kZt.LJ(c1322110kVd, Uri.fromFile(new C0VSJ(path)), (int) (i2 * 0.5625f), i2, null, Bitmap.Config.ARGB_8888, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.11uB
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str, Throwable th) {
                this.LLILZLL.invoke(Boolean.FALSE);
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str, Object obj, Animatable animatable) {
                if (i == 0) {
                    C19648811uA c19648811uA = this;
                    if (!c19648811uA.LLIZ) {
                        c19648811uA.LLIZ = true;
                        c19648811uA.LLILZLL.invoke(Boolean.TRUE);
                    }
                }
            }
        }, null);
        C786410Ut5.q9(c1322110kVd, new ACListenerS163S0100000_29(i, this, 74));
        this.LLJI[i] = c1322110kVd;
        viewGroup.addView(c1322110kVd);
        return c1322110kVd;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C1322090kVb c1322090kVb;
        if ((obj instanceof C1322110kVd) && (c1322090kVb = (C1322090kVb) obj) != null) {
            c1322090kVb.setController(null);
        }
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }

    public C19648811uA(Context context, List list, int i, VideoPublishEditModel videoPublishEditModel, AwS608S0100000_29 awS608S0100000_29) {
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = awS608S0100000_29;
        int size = list.size();
        ImageSynthesisResult[] imageSynthesisResultArr = new ImageSynthesisResult[size];
        for (int i2 = 0; i2 < size; i2++) {
            imageSynthesisResultArr[i2] = null;
        }
        this.LLJ = imageSynthesisResultArr;
        C1322110kVd[] c1322110kVdArr = new C1322110kVd[size];
        for (int i3 = 0; i3 < size; i3++) {
            c1322110kVdArr[i3] = null;
        }
        this.LLJI = c1322110kVdArr;
    }
}
