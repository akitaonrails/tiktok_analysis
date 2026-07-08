package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725580SdA {
    public static final C01GW<Keva> LJIIJ = C1935107i1.LIZ(AFwS198S0000000_11.get$arr$(356));
    public final String LIZ;
    public final String LIZIZ;
    public final ConstraintLayout LIZJ;
    public final Function0<FeedCollectionViewPagerAbility> LIZLLL;
    public final Function0<UserFeedViewPagerAbility> LJ;
    public AnonymousClass0956 LJFF;
    public final C054G LJI = C2296808zG.LIZ(C2108208Ns.LIZ);
    public final LinkedBlockingQueue<C725670SdJ> LJII = new LinkedBlockingQueue<>();
    public String LJIIIIZZ;
    public boolean LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725580SdA.LJ():void");
    }

    public static boolean LIZJ(FeedCollectionViewPagerAbility feedCollectionViewPagerAbility) {
        if (feedCollectionViewPagerAbility == null || feedCollectionViewPagerAbility.LJIL() + 1 == feedCollectionViewPagerAbility.LJJLIIIJL().getCount()) {
            return false;
        }
        return true;
    }

    public final JSONObject LIZ(Function1<? super JSONObject, Unit> function1) {
        Aweme awemeLJIIIIZZ;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LIZ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("enter_from", str);
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityInvoke = this.LIZLLL.invoke();
            if (feedCollectionViewPagerAbilityInvoke != null && (awemeLJIIIIZZ = feedCollectionViewPagerAbilityInvoke.LJIIIIZZ()) != null) {
                jSONObject.put("group_id", awemeLJIIIIZZ.getGroupId());
                jSONObject.put("author_id", AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
                jSONObject.put("follow_status", C0OD6.LIZ(awemeLJIIIIZZ.getAuthor()));
                function1.invoke(jSONObject);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C707170RoZ
            if (r0 == 0) goto L7d
            r4 = r7
            X.0RoZ r4 = (X.C707170RoZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L5f
            if (r0 != r3) goto L83
            X.C155000ia.LIZIZ(r1)
        L22:
            java.util.concurrent.LinkedBlockingQueue<X.0SdJ> r0 = r6.LJII
            java.lang.Object r2 = r0.poll()
            X.0SdJ r2 = (X.C725670SdJ) r2
            if (r2 != 0) goto L32
            r6.LIZLLL(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "running task, "
            r1.append(r0)
            java.util.concurrent.LinkedBlockingQueue<X.0SdJ> r0 = r6.LJII
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " task(s) remain"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "StoryGestureEducation"
            X.C1720106oR.LJI(r0, r1)
            kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r2.LIZ
            r4.LLILLL = r3
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r5) goto L22
            return r5
        L5f:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.LinkedBlockingQueue<X.0SdJ> r0 = r6.LJII
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L71
            r6.LIZLLL(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L71:
            X.0Hr6 r1 = new X.0Hr6
            r0 = 4
            r1.<init>(r3, r2, r0)
            X.C1440005kM.LIZ(r1)
            r6.LJIIIZ = r3
            goto L22
        L7d:
            X.0RoZ r4 = new X.0RoZ
            r4.<init>(r6, r7)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725580SdA.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZLLL(boolean z) {
        if (this.LJIIIZ && z) {
            C1440005kM.LIZ(new C453940Hr6(false, false, 4));
            this.LJIIIZ = false;
        }
        this.LJFF = null;
        PopupManager.LIZJ(C725630SdF.class);
        PopupManager.LIZJ(C20674415vC.class);
    }

    public static Object LJFF(C725580SdA c725580SdA, AbstractC725620SdE abstractC725620SdE, InterfaceC725710SdN interfaceC725710SdN, InterfaceC1364105Vn interfaceC1364105Vn) {
        c725580SdA.getClass();
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        abstractC725620SdE.LLILLL = new AwS220S0300000_11(abstractC725620SdE, c725580SdA, c23260099m, 17);
        abstractC725620SdE.LLILZ = new AwS255S0300000_11(c725580SdA, abstractC725620SdE, interfaceC725710SdN, 7);
        if ("".length() > 0) {
            PopupManager.LJIIZILJ(abstractC725620SdE, new C1668306g5(""));
        } else {
            PopupManager.LJIJI(abstractC725620SdE, true);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }

    public C725580SdA(String str, String str2, ConstraintLayout constraintLayout, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = constraintLayout;
        this.LIZLLL = awS555S0100000_11;
        this.LJ = awS555S0100000_112;
    }
}
