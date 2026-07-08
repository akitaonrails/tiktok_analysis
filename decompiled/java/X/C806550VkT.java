package X;

import android.database.sqlite.SQLiteBlobTooBigException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0VkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository$initCacheFromDB$1", f = "FriendsV3FeedRepository.kt", l = {112, 115}, m = "invokeSuspend")
public final class C806550VkT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C806550VkT(InterfaceC1364105Vn<? super C806550VkT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806550VkT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        String strLIZLLL;
        C1C7U.LIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = false;
        try {
        } catch (SQLiteBlobTooBigException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initCacheFromDB, stored feeds too big, e=");
            sbLIZ.append(e);
            C0W17.LIZ("repo", C2188811AlT.LIZIZ(sbLIZ));
            FriendsV3FeedRepository.LIZ.getClass();
            C806500VkO c806500VkOLJ = FriendsV3FeedRepository.LJ();
            this.LL = null;
            this.LLILLJJLI = 2;
            c806500VkOLJ.getClass();
            if (strLIZLLL == null || strLIZLLL.length() == 0) {
                z = true;
            }
            if (z) {
                C0W17.LIZ("DB", "clearDBCache, invalid uid");
                objLJI = Unit.LIZ;
            } else {
                objLJI = C23250099c.LJI(this, (AbstractC23273099z) C806500VkO.LJ.getValue(), new C804850Vhj(strLIZLLL, null));
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
                return objLJFF;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            FriendsV3FeedRepository.LIZ.getClass();
            C806500VkO c806500VkOLJ2 = FriendsV3FeedRepository.LJ();
            EnumC806530VkR enumC806530VkR = EnumC806530VkR.FAILED;
            c806500VkOLJ2.getClass();
            C806500VkO.LIZIZ = enumC806530VkR;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initCacheFromDB, unknown error=");
            sbLIZ2.append(e2);
            C0W17.LIZ("repo", C2188811AlT.LIZIZ(sbLIZ2));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
            return unit;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    FriendsV3FeedRepository.LIZ.getClass();
                    C806500VkO c806500VkOLJ3 = FriendsV3FeedRepository.LJ();
                    EnumC806530VkR enumC806530VkR2 = EnumC806530VkR.FAILED;
                    c806500VkOLJ3.getClass();
                    C806500VkO.LIZIZ = enumC806530VkR2;
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
                    return unit2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strLIZLLL = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            FriendsV3FeedRepository.LIZ.getClass();
            strLIZLLL = FriendsV3FeedRepository.LIZLLL();
            if (strLIZLLL == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
                return unit3;
            }
            C806500VkO c806500VkOLJ4 = FriendsV3FeedRepository.LJ();
            this.LL = strLIZLLL;
            this.LLILLJJLI = 1;
            obj = c806500VkOLJ4.LIZ(strLIZLLL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
                return objLJFF;
            }
        }
        FriendsV3FeedResponse friendsV3FeedResponse = (FriendsV3FeedResponse) obj;
        FriendsV3FeedRepository.LIZ.getClass();
        C806500VkO c806500VkOLJ5 = FriendsV3FeedRepository.LJ();
        EnumC806530VkR enumC806530VkR3 = EnumC806530VkR.LOADED;
        c806500VkOLJ5.getClass();
        C806500VkO.LIZIZ = enumC806530VkR3;
        if (friendsV3FeedResponse != null) {
            C0W17.LIZJ("repo", "initCacheFromDB, db not null, update cache");
            FriendsV3FeedRepository.LIZIZ().LIZLLL(strLIZLLL, friendsV3FeedResponse, EnumC599100Nee.DB, 0);
            if (C1206704np.LIZ()) {
                C1599640rjG.LIZIZ.On();
            }
        } else {
            C0W17.LIZJ("repo", "initCacheFromDB, db is null, do nothing");
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.initCacheFromDB$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C806550VkT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
