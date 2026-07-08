package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarManagementAPI;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarPreloadHandler$preloadSocialAvatarResponse$1", f = "SocialAvatarPreloadHandler.kt", l = {138, 179}, m = "invokeSuspend")
public final class C437180HCi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public SocialAvatarResultResponse LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437180HCi(String str, InterfaceC1364105Vn<? super C437180HCi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437180HCi(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        String str;
        ?? arrayList;
        SocialAvatarResultResponse socialAvatarResultResponse;
        String str2;
        String str3;
        String str4;
        String str5;
        Object objQuerySocialAvatarResponse = obj;
        C1C7U.LIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = true;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ConcurrentHashMap<String, C437200HCk> concurrentHashMap = C437190HCj.LIZ;
            C437190HCj.LIZIZ(this.LLILZ, null);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    socialAvatarResultResponse = this.LLILLJJLI;
                    C155000ia.LIZIZ(objQuerySocialAvatarResponse);
                    SystemClock.elapsedRealtime();
                    ConcurrentHashMap<String, C437200HCk> concurrentHashMap2 = C437190HCj.LIZ;
                    C437190HCj.LIZIZ(this.LLILZ, socialAvatarResultResponse);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jElapsedRealtime = this.LL;
            C155000ia.LIZIZ(objQuerySocialAvatarResponse);
        } else {
            C155000ia.LIZIZ(objQuerySocialAvatarResponse);
            C0HYP.LIZ.getClass();
            C0HYP.LJ().storeInt("review_page_preloading_times", C0HYP.LJ().getInt("review_page_preloading_times", 0) + 1);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            SocialAvatarManagementAPI.LIZ.getClass();
            SocialAvatarManagementAPI socialAvatarManagementAPILIZ = C0HDF.LIZ();
            this.LL = jElapsedRealtime;
            this.LLILLL = 1;
            objQuerySocialAvatarResponse = socialAvatarManagementAPILIZ.querySocialAvatarResponse(this);
            if (objQuerySocialAvatarResponse == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
                return objLJFF;
            }
        }
        SocialAvatarResultResponse socialAvatarResultResponse2 = (SocialAvatarResultResponse) objQuerySocialAvatarResponse;
        if (socialAvatarResultResponse2.status_code == 0) {
            List<String> list = socialAvatarResultResponse2.avatarUrls;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                List<String> list2 = socialAvatarResultResponse2.avatarUrisInUserBucket;
                if (list2 != null) {
                    str = (String) C13LP.LJJJLL(list2);
                } else {
                    str = null;
                }
                C0HYP.LIZ.getClass();
                String string = C0HYP.LJ().getString("review_page_preloading_key", null);
                if (str != null && Intrinsics.LJFF(str, string)) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
                    return unit2;
                }
                C0HYP.LJ().storeString("review_page_preloading_key", str);
                socialAvatarResultResponse2.checkValid();
                List<String> list3 = socialAvatarResultResponse2.avatarUrls;
                if (list3 != null) {
                    Iterable iterable = socialAvatarResultResponse2.animationUrls;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    List listLLIILII = C13LP.LLIILII(list3, iterable);
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLLIILII, 10));
                    int i2 = 0;
                    for (Object obj2 : (ArrayList) listLLIILII) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            Pair pair = (Pair) obj2;
                            String str6 = (String) pair.getFirst();
                            String str7 = (String) pair.getSecond();
                            List<String> list4 = socialAvatarResultResponse2.animationGifUrls;
                            if (list4 != null) {
                                str2 = list4.get(i2);
                            } else {
                                str2 = null;
                            }
                            List<String> list5 = socialAvatarResultResponse2.avatarUrisInUserBucket;
                            if (list5 != null) {
                                str3 = list5.get(i2);
                            } else {
                                str3 = null;
                            }
                            List<String> list6 = socialAvatarResultResponse2.animationUrisInUserBucket;
                            if (list6 != null) {
                                str4 = list6.get(i2);
                            } else {
                                str4 = null;
                            }
                            List<String> list7 = socialAvatarResultResponse2.expressionNameList;
                            if (list7 == null || (str5 = list7.get(i2)) == null) {
                                str5 = "";
                            }
                            arrayList.add(new C436960HBm(str6, str7, i2, str2, str3, str4, str5));
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Boolean.valueOf(arrayList2.add(new C436950HBl((C436960HBm) it2.next()))));
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                int i4 = 0;
                for (Object obj3 : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C436960HBm c436960HBm = (C436960HBm) obj3;
                        C054G c054g = C437190HCj.LIZIZ;
                        C099G c099gLIZIZ = C23250099c.LIZIZ(c054g, null, null, new C434040H0g(c436960HBm, null), 3);
                        C099G c099gLIZIZ2 = C23250099c.LIZIZ(c054g, null, null, new C434050H0h(c436960HBm, null), 3);
                        arrayList3.add(c099gLIZIZ);
                        arrayList5.add(Boolean.valueOf(arrayList3.add(c099gLIZIZ2)));
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                this.LLILLJJLI = socialAvatarResultResponse2;
                this.LL = jElapsedRealtime;
                this.LLILLL = 2;
                if (C1D9F.LIZ(arrayList3, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
                    return objLJFF;
                }
                socialAvatarResultResponse = socialAvatarResultResponse2;
                SystemClock.elapsedRealtime();
                ConcurrentHashMap<String, C437200HCk> concurrentHashMap22 = C437190HCj.LIZ;
                C437190HCj.LIZIZ(this.LLILZ, socialAvatarResultResponse);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
                return unit3;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarPreloadHandler@4de5.preloadSocialAvatarResponse$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
