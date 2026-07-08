package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807790VmT implements InterfaceC808200Vn8<String, RuleHitState, C795570VIt> {
    public final InterfaceC807830VmX LIZ;
    public final Gson LIZIZ = C08JS.LIZIZ();
    public final Type LIZJ = new TypeToken<List<? extends String>>() { // from class: X.0VmW
    }.getType();

    public C807790VmT(InterfaceC807830VmX interfaceC807830VmX) {
        this.LIZ = interfaceC807830VmX;
    }

    @Override // X.InterfaceC808200Vn8
    public final /* bridge */ /* synthetic */ String LIZJ(RuleHitState ruleHitState) {
        return null;
    }

    @Override // X.InterfaceC808200Vn8
    public final Pair<String, RuleHitState> LJI(C795570VIt c795570VIt) {
        C795570VIt c795570VIt2 = c795570VIt;
        return new Pair<>(c795570VIt2.LIZ, new RuleHitState(c795570VIt2.LIZ, c795570VIt2.LIZIZ, c795570VIt2.LIZJ, (List) GsonProtectorUtils.fromJson(this.LIZIZ, c795570VIt2.LIZLLL, this.LIZJ), c795570VIt2.LJ, c795570VIt2.LJFF));
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LIZ(List list, C808150Vn3 c808150Vn3) {
        if (((ArrayList) list).isEmpty()) {
            return Unit.LIZ;
        }
        InterfaceC807830VmX interfaceC807830VmX = this.LIZ;
        if (interfaceC807830VmX != null) {
            Object objLIZ = interfaceC807830VmX.LIZ(list, c808150Vn3);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // X.InterfaceC808200Vn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Set<java.lang.String> r6, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C795570VIt>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C807800VmU
            if (r0 == 0) goto L3f
            r4 = r7
            X.0VmU r4 = (X.C807800VmU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            if (r3 == 0) goto L2c
            java.util.List r0 = X.C13LP.LLIIII(r3)
            if (r0 != 0) goto L2e
        L2c:
            X.13BV r0 = X.C13BV.INSTANCE
        L2e:
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            X.0VmX r0 = r5.LIZ
            if (r0 == 0) goto L2c
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZJ(r4)
            if (r3 != r2) goto L22
            return r2
        L3f:
            X.0VmU r4 = new X.0VmU
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C807790VmT.LIZLLL(java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    @Override // X.InterfaceC808200Vn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C807810VmV
            if (r0 == 0) goto L3f
            r4 = r7
            X.0VmV r4 = (X.C807810VmV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.0VmX r0 = r5.LIZ
            if (r0 == 0) goto L3d
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZLLL(r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            r0 = 0
            goto L28
        L3f:
            X.0VmV r4 = new X.0VmV
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C807790VmT.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LIZIZ(int i, String str, C808150Vn3 c808150Vn3) {
        if (i <= 0) {
            return Unit.LIZ;
        }
        InterfaceC807830VmX interfaceC807830VmX = this.LIZ;
        if (interfaceC807830VmX != null) {
            Object objLIZIZ = interfaceC807830VmX.LIZIZ(i, c808150Vn3);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LJ(long j, Object obj, Object obj2) {
        String str = (String) obj;
        RuleHitState ruleHitState = (RuleHitState) obj2;
        String str2 = ruleHitState.uniqueKey;
        if (str2 != null) {
            str = str2;
        }
        String str3 = ruleHitState.outreachKey;
        if (str3 == null) {
            str3 = "";
        }
        return new C795570VIt(j, ruleHitState.isHit(), str, str3, GsonProtectorUtils.toJson(this.LIZIZ, ruleHitState.hitRuleIds, this.LIZJ), ruleHitState.ruleStrategy);
    }
}
