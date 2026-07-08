package Y;

import X.C11X2;
import X.C1661820tLY;
import X.C2286608xc;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AgS168S0300000_14 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C11X2 r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C861700XrE
            if (r0 == 0) goto L52
            r5 = r8
            X.0XrE r5 = (X.C861700XrE) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L58
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.Object r1 = r6.l2
            X.0Xqe r1 = (X.C861340Xqe) r1
            X.11X0 r2 = (X.C11X0) r2
            if (r2 == 0) goto L3a
            X.0XrF r0 = new X.0XrF
            r0.<init>()
            r2.LIZLLL = r0
            X.15Pf r0 = r2.LIZLLL()
        L35:
            r1.LIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            r0 = 0
            goto L35
        L3c:
            X.C155000ia.LIZIZ(r2)
            X.11X1 r2 = X.C11X0.LJFF
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel r1 = (com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel) r1
            java.lang.Object r0 = r6.l1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LLILLL = r3
            java.lang.Object r2 = r2.LIZ(r1, r0, r7, r5)
            if (r2 != r4) goto L22
            return r4
        L52:
            X.0XrE r5 = new X.0XrE
            r5.<init>(r6, r8)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS168S0300000_14.LIZ$0(X.11X2, X.05Vn):java.lang.Object");
    }

    public static final Object emit$0(AgS168S0300000_14 agS168S0300000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((C1661820tLY) obj).LJI) {
            StoryEditToolbarComponent storyEditToolbarComponent = (StoryEditToolbarComponent) agS168S0300000_14.l0;
            if (!storyEditToolbarComponent.LLJJ) {
                storyEditToolbarComponent.LLJJ = true;
                ((Rect) agS168S0300000_14.l1).left -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(32)));
                ((StoryEditToolbarComponent) agS168S0300000_14.l0).E3((Function0) agS168S0300000_14.l2, (Rect) agS168S0300000_14.l1);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS168S0300000_14 agS168S0300000_14, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS168S0300000_14.LIZ$0((C11X2) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS168S0300000_14(Object obj, StoryEditToolbarComponent storyEditToolbarComponent, Rect rect, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = storyEditToolbarComponent;
        this.l2 = rect;
    }
}
