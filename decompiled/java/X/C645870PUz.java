package X;

import Y.AsS37S0100000_10;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645870PUz extends FrameLayout {
    public final ViewOnAttachStateChangeListenerC20604515jv LL;
    public final C01GW LLILLJJLI;
    public ActivityCardThemeViewModel LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public List<ResearchFilterStruct> LLILZLL;
    public final C01GW LLIZ;
    public final AsS37S0100000_10 LLIZLLLIL;

    private final ArgbEvaluator getArgbEvaluator() {
        return (ArgbEvaluator) this.LLIZ.getValue();
    }

    private final C20603715jn getPowerConfig() {
        C20603715jn c20603715jn = new C20603715jn();
        int i = 4;
        c20603715jn.LJIIIIZZ = new OptimizeAbility(i, true, null, i);
        return c20603715jn;
    }

    private final List<InterfaceC1891350zJl> getPowerListItems() {
        ArrayList arrayList = new ArrayList();
        List<ResearchFilterStruct> list = this.LLILZLL;
        if (list != null) {
            Iterator<ResearchFilterStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C645850PUx(it2.next()));
            }
        }
        return arrayList;
    }

    private final C0PV0 getSwipeItemDecoration() {
        return (C0PV0) this.LLILLJJLI.getValue();
    }

    public final int getLastBottomMargin() {
        return (this.LLILZIL || C650240Pew.LIZ()) ? C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics())) : this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645870PUz.onAttachedToWindow():void");
    }

    public final boolean getBanAdjustBottomMargin() {
        return this.LLILZIL;
    }

    public C645870PUz(Context context) {
        super(context, null, 0);
        this.LL = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(717));
        this.LLIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(716));
        this.LLIZLLLIL = new AsS37S0100000_10(this, 29);
    }

    public final void setBanAdjustBottomMargin(boolean z) {
        this.LLILZIL = z;
    }
}
