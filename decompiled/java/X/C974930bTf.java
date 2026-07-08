package X;

import webcast.api.battle.BattleAcceptResponse;

/* JADX INFO: renamed from: X.0bTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974930bTf {
    public final BattleAcceptResponse.ResponseData LIZ;
    public final Throwable LIZIZ;
    public final EnumC976390bW1 LIZJ;
    public final EnumC976390bW1 LIZLLL;

    public C974930bTf() {
        this(null, null, null, null);
    }

    public C974930bTf(BattleAcceptResponse.ResponseData responseData, Throwable th, EnumC976390bW1 enumC976390bW1, EnumC976390bW1 enumC976390bW12) {
        this.LIZ = responseData;
        this.LIZIZ = th;
        this.LIZJ = enumC976390bW1;
        this.LIZLLL = enumC976390bW12;
    }

    public static C974930bTf LIZ(C974930bTf c974930bTf, BattleAcceptResponse.ResponseData responseData, Throwable th, EnumC976390bW1 enumC976390bW1, EnumC976390bW1 enumC976390bW12, int i) {
        if ((i & 1) != 0) {
            responseData = c974930bTf.LIZ;
        }
        if ((i & 2) != 0) {
            th = c974930bTf.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC976390bW1 = c974930bTf.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC976390bW12 = c974930bTf.LIZLLL;
        }
        return new C974930bTf(responseData, th, enumC976390bW1, enumC976390bW12);
    }
}
