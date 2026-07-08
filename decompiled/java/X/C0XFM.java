package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.TokenBlobReader$readTokenFromBlob$1", f = "TokenBlobReader.kt", l = {83, 90, 96, 107, 113, 119, 131, 137, 151, 157, 196, 199, 205, 210}, m = "invokeSuspend")
public final class C0XFM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<C0XFZ, Unit> LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0XFM(boolean z, String str, String str2, Function1<? super C0XFZ, Unit> function1, Context context, InterfaceC1364105Vn<? super C0XFM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function1;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XFM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Pair<Boolean, String> gaid;
        String second;
        boolean z2;
        boolean z3;
        boolean z4;
        C0XFZ c0xfy;
        C1C7U.LIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
        Object objLJFF = C099R.LJFF();
        try {
            try {
                try {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("read blob exception: ");
                        sbLIZ.append(e.getMessage());
                        C0XFF.LIZIZ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ));
                        String str = this.LLILLL;
                        String str2 = this.LLILZ;
                        long jCurrentTimeMillis = System.currentTimeMillis() - C0XFI.LIZIZ;
                        C0XFN c0xfn = C0XFN.BLOB_PARSE_TOKEN_FAILED;
                        Function1<C0XFZ, Unit> function1 = this.LLILZIL;
                        this.LL = 13;
                        if (C0XFI.LIZLLL(str, str2, jCurrentTimeMillis, c0xfn, function1, this) == objLJFF) {
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return objLJFF;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("read blob exception: ");
                    sbLIZ2.append(e2.getMessage());
                    C0XFF.LIZIZ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ2));
                    String str3 = this.LLILLL;
                    String str4 = this.LLILZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - C0XFI.LIZIZ;
                    C0XFN c0xfn2 = C0XFN.BLOB_READ_BLOB_FAILED;
                    Function1<C0XFZ, Unit> function12 = this.LLILZIL;
                    this.LL = 10;
                    if (C0XFI.LIZLLL(str3, str4, jCurrentTimeMillis2, c0xfn2, function12, this) == objLJFF) {
                        C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("get gaid exception: ");
                sbLIZ3.append(e3.getMessage());
                C0XFF.LIZIZ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ3));
                String str5 = this.LLILLL;
                String str6 = this.LLILZ;
                long jCurrentTimeMillis3 = System.currentTimeMillis() - C0XFI.LIZIZ;
                C0XFN c0xfn3 = C0XFN.BLOB_GET_GAID_FAILED;
                Function1<C0XFZ, Unit> function13 = this.LLILZIL;
                this.LL = 6;
                if (C0XFI.LIZLLL(str5, str6, jCurrentTimeMillis3, c0xfn3, function13, this) == objLJFF) {
                    C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                    return objLJFF;
                }
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("unknown exception: ");
            sbLIZ4.append(e4.getMessage());
            C0XFF.LIZIZ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ4));
            String str7 = this.LLILLL;
            String str8 = this.LLILZ;
            long jCurrentTimeMillis4 = System.currentTimeMillis() - C0XFI.LIZIZ;
            C0XFN c0xfn4 = C0XFN.BLOB_UNKNOWN_ERROR;
            Function1<C0XFZ, Unit> function14 = this.LLILZIL;
            this.LL = 14;
            if (C0XFI.LIZLLL(str7, str8, jCurrentTimeMillis4, c0xfn4, function14, this) == objLJFF) {
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return objLJFF;
            }
        }
        switch (this.LL) {
            case 0:
                C155000ia.LIZIZ(obj);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("readTokenFromBlob start, current thread: ");
                sbLIZ5.append(C786410Ut5.u3().getName());
                C0XFF.LIZJ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ5));
                C0XFJ c0xfj = C0XFI.LIZJ;
                if (c0xfj != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("version_id", this.LLILZ);
                    c0xfj.sendEvent("oidc_get_token_from_blob", jSONObject);
                }
                C0XFI.LIZIZ = System.currentTimeMillis();
                if (Build.VERSION.SDK_INT < 30) {
                    C0XFF.LIZJ("TokenBlobReader", "readFromBlob: os not support");
                    String str9 = this.LLILLL;
                    String str10 = this.LLILZ;
                    long jCurrentTimeMillis5 = System.currentTimeMillis() - C0XFI.LIZIZ;
                    C0XFN c0xfn5 = C0XFN.BLOB_OS_VERSION_TOO_LOW;
                    Function1<C0XFZ, Unit> function15 = this.LLILZIL;
                    this.LL = 1;
                    if (C0XFI.LIZLLL(str9, str10, jCurrentTimeMillis5, c0xfn5, function15, this) == objLJFF) {
                        C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                        return objLJFF;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                    return unit;
                }
                List<String> list = C0XFW.LIZ;
                String strLIZJ = C0XFW.LIZJ(this.LLILZLL);
                if (strLIZJ != null && strLIZJ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C0XFF.LIZJ("TokenBlobReader", "readFromBlob: tiktok is not installed");
                    String str11 = this.LLILLL;
                    String str12 = this.LLILZ;
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - C0XFI.LIZIZ;
                    C0XFN c0xfn6 = C0XFN.NO_AVAILABLE_TT_INSTALLED;
                    Function1<C0XFZ, Unit> function16 = this.LLILZIL;
                    this.LL = 2;
                    if (C0XFI.LIZLLL(str11, str12, jCurrentTimeMillis6, c0xfn6, function16, this) == objLJFF) {
                        C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                        return objLJFF;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                    return unit2;
                }
                if (!C0XFW.LJI(this.LLILZLL, strLIZJ)) {
                    C0XFF.LIZJ("TokenBlobReader", "readFromBlob: tiktok not support");
                    String str13 = this.LLILLL;
                    String str14 = this.LLILZ;
                    long jCurrentTimeMillis7 = System.currentTimeMillis() - C0XFI.LIZIZ;
                    C0XFN c0xfn7 = C0XFN.BLOB_TIKTOK_VERSION_TOO_LOW;
                    Function1<C0XFZ, Unit> function17 = this.LLILZIL;
                    this.LL = 3;
                    if (C0XFI.LIZLLL(str13, str14, jCurrentTimeMillis7, c0xfn7, function17, this) == objLJFF) {
                        C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                        return objLJFF;
                    }
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                    return unit3;
                }
                long jCurrentTimeMillis8 = System.currentTimeMillis();
                C0XFJ c0xfj2 = C0XFI.LIZJ;
                if (c0xfj2 != null) {
                    gaid = c0xfj2.getGaid(this.LLILZLL);
                } else {
                    gaid = null;
                }
                if (gaid == null || (second = gaid.getSecond()) == null) {
                    second = "";
                }
                if (gaid != null) {
                    if (second.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && !Intrinsics.LJFF("00000000-0000-0000-0000-000000000000", second)) {
                        if (gaid.getFirst().booleanValue()) {
                            C0XFF.LIZJ("TokenBlobReader", "gaid is limited, skip read blob");
                            String str15 = this.LLILLL;
                            String str16 = this.LLILZ;
                            long jCurrentTimeMillis9 = System.currentTimeMillis() - C0XFI.LIZIZ;
                            C0XFN c0xfn8 = C0XFN.BLOB_GAID_IS_LIMITED;
                            Function1<C0XFZ, Unit> function18 = this.LLILZIL;
                            this.LL = 5;
                            if (C0XFI.LIZLLL(str15, str16, jCurrentTimeMillis9, c0xfn8, function18, this) == objLJFF) {
                                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                                return objLJFF;
                            }
                            Unit unit4 = Unit.LIZ;
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return unit4;
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("get gaid success, cost: ");
                        sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis8);
                        sbLIZ6.append(", fromStart: ");
                        sbLIZ6.append(System.currentTimeMillis() - C0XFI.LIZIZ);
                        C0XFF.LIZJ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ6));
                        C0XFJ c0xfj3 = C0XFI.LIZJ;
                        if (c0xfj3 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("version_id", this.LLILZ);
                            jSONObject2.put("duration", System.currentTimeMillis() - C0XFI.LIZIZ);
                            c0xfj3.sendEvent("oidc_get_gaid_success", jSONObject2);
                        }
                        String strLIZ = C0XFI.LIZ(C0XFI.LJI(second));
                        if (strLIZ == null) {
                            C0XFF.LIZJ("TokenBlobReader", "digest get failed, skip read blob");
                            String str17 = this.LLILLL;
                            String str18 = this.LLILZ;
                            long jCurrentTimeMillis10 = System.currentTimeMillis() - C0XFI.LIZIZ;
                            C0XFN c0xfn9 = C0XFN.BLOB_DIGEST_GET_FAILED;
                            Function1<C0XFZ, Unit> function19 = this.LLILZIL;
                            this.LL = 7;
                            if (C0XFI.LIZLLL(str17, str18, jCurrentTimeMillis10, c0xfn9, function19, this) == objLJFF) {
                                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                                return objLJFF;
                            }
                            Unit unit5 = Unit.LIZ;
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return unit5;
                        }
                        if (strLIZ.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            C0XFF.LIZJ("TokenBlobReader", "digest is empty, skip read blob");
                            String str19 = this.LLILLL;
                            String str20 = this.LLILZ;
                            long jCurrentTimeMillis11 = System.currentTimeMillis() - C0XFI.LIZIZ;
                            C0XFN c0xfn10 = C0XFN.BLOB_DIGEST_IS_EMPTY;
                            Function1<C0XFZ, Unit> function110 = this.LLILZIL;
                            this.LL = 8;
                            if (C0XFI.LIZLLL(str19, str20, jCurrentTimeMillis11, c0xfn10, function110, this) == objLJFF) {
                                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                                return objLJFF;
                            }
                            Unit unit6 = Unit.LIZ;
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return unit6;
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("get digest success, cost: ");
                        sbLIZ7.append(System.currentTimeMillis() - C0XFI.LIZIZ);
                        C0XFF.LIZJ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ7));
                        C0XFJ c0xfj4 = C0XFI.LIZJ;
                        if (c0xfj4 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("version_id", this.LLILZ);
                            jSONObject3.put("duration", System.currentTimeMillis() - C0XFI.LIZIZ);
                            c0xfj4.sendEvent("oidc_get_digest_success", jSONObject3);
                        }
                        String strLJFF = C0XFI.LJFF(this.LLILZLL, strLIZ);
                        if (strLJFF.length() == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            C0XFF.LIZJ("TokenBlobReader", "blob is empty, skip read blob");
                            String str21 = this.LLILLL;
                            String str22 = this.LLILZ;
                            long jCurrentTimeMillis12 = System.currentTimeMillis() - C0XFI.LIZIZ;
                            C0XFN c0xfn11 = C0XFN.BLOB_READ_BLOB_FAILED;
                            Function1<C0XFZ, Unit> function111 = this.LLILZIL;
                            this.LL = 9;
                            if (C0XFI.LIZLLL(str21, str22, jCurrentTimeMillis12, c0xfn11, function111, this) == objLJFF) {
                                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                                return objLJFF;
                            }
                            Unit unit7 = Unit.LIZ;
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return unit7;
                        }
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("read blob success, cost: ");
                        sbLIZ8.append(System.currentTimeMillis() - C0XFI.LIZIZ);
                        C0XFF.LIZJ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ8));
                        C0XFJ c0xfj5 = C0XFI.LIZJ;
                        if (c0xfj5 != null) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("version_id", this.LLILZ);
                            jSONObject4.put("duration", System.currentTimeMillis() - C0XFI.LIZIZ);
                            c0xfj5.sendEvent("oidc_read_blob_success", jSONObject4);
                        }
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArrayOptJSONArray = new JSONObject(strLJFF).optJSONArray("tokens");
                        if (jSONArrayOptJSONArray != null) {
                            int length = jSONArrayOptJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null) {
                                    Boolean.valueOf(arrayList.add(C0XFI.LIZIZ().LJII(C786410Ut5.J3(jSONObjectOptJSONObject), OneTapLoginShareInfo.class)));
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (!this.LLILLJJLI) {
                                c0xfy = new C0XFX((OneTapLoginShareInfo) C13LP.LJJJJZI(arrayList), this.LLILLL, this.LLILZ, C2097908Jt.LIZJ(new Pair("read_from", "BlobStore")));
                            } else {
                                c0xfy = new C0XFY(arrayList, this.LLILLL, this.LLILZ, C2097908Jt.LIZJ(new Pair("read_from", "BlobStore")));
                            }
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("get tokens from blob success, count: ");
                            sbLIZ9.append(arrayList.size());
                            sbLIZ9.append(", cost: ");
                            sbLIZ9.append(System.currentTimeMillis() - C0XFI.LIZIZ);
                            C0XFF.LIZJ("TokenBlobReader", C2188811AlT.LIZIZ(sbLIZ9));
                            int size = arrayList.size();
                            String str23 = this.LLILZ;
                            long jCurrentTimeMillis13 = System.currentTimeMillis() - C0XFI.LIZIZ;
                            C0XFN c0xfn12 = C0XFN.BLOB_SUCCESS;
                            Function1<C0XFZ, Unit> function112 = this.LLILZIL;
                            this.LL = 11;
                            if (C0XFI.LJ(size, str23, jCurrentTimeMillis13, c0xfn12, c0xfy, function112, this) == objLJFF) {
                                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                                return objLJFF;
                            }
                            Unit unit8 = Unit.LIZ;
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return unit8;
                        }
                        String str24 = this.LLILLL;
                        String str25 = this.LLILZ;
                        long jCurrentTimeMillis14 = System.currentTimeMillis() - C0XFI.LIZIZ;
                        C0XFN c0xfn13 = C0XFN.BLOB_NO_AVAILABLE_TOKEN;
                        Function1<C0XFZ, Unit> function113 = this.LLILZIL;
                        this.LL = 12;
                        if (C0XFI.LIZLLL(str24, str25, jCurrentTimeMillis14, c0xfn13, function113, this) == objLJFF) {
                            C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                            return objLJFF;
                        }
                        C0XFF.LIZJ("TokenBlobReader", "get tokens from blob is empty");
                        Unit unit82 = Unit.LIZ;
                        C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                        return unit82;
                    }
                }
                C0XFF.LIZJ("TokenBlobReader", "gaid is empty, skip read blob");
                String str26 = this.LLILLL;
                String str27 = this.LLILZ;
                long jCurrentTimeMillis15 = System.currentTimeMillis() - C0XFI.LIZIZ;
                C0XFN c0xfn14 = C0XFN.BLOB_GAID_IS_EMPTY;
                Function1<C0XFZ, Unit> function114 = this.LLILZIL;
                this.LL = 4;
                if (C0XFI.LIZLLL(str26, str27, jCurrentTimeMillis15, c0xfn14, function114, this) == objLJFF) {
                    C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                    return objLJFF;
                }
                Unit unit9 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit9;
            case 1:
                C155000ia.LIZIZ(obj);
                Unit unit10 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit10;
            case 2:
                C155000ia.LIZIZ(obj);
                Unit unit22 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit22;
            case 3:
                C155000ia.LIZIZ(obj);
                Unit unit32 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit32;
            case 4:
                C155000ia.LIZIZ(obj);
                Unit unit92 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit92;
            case 5:
                C155000ia.LIZIZ(obj);
                Unit unit42 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit42;
            case 6:
                C155000ia.LIZIZ(obj);
                Unit unit11 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit11;
            case 7:
                C155000ia.LIZIZ(obj);
                Unit unit52 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit52;
            case 8:
                C155000ia.LIZIZ(obj);
                Unit unit62 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit62;
            case BdTuring.TYPE_ECAF /* 9 */:
                C155000ia.LIZIZ(obj);
                Unit unit72 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit72;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C155000ia.LIZIZ(obj);
                Unit unit12 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit12;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C155000ia.LIZIZ(obj);
                Unit unit822 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit822;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C155000ia.LIZIZ(obj);
                C0XFF.LIZJ("TokenBlobReader", "get tokens from blob is empty");
                Unit unit8222 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit8222;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C155000ia.LIZIZ(obj);
                Unit unit82222 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit82222;
            case 14:
                C155000ia.LIZIZ(obj);
                Unit unit822222 = Unit.LIZ;
                C1C7U.LIZIZ("TokenBlobReader@9e9f.readTokenFromBlob$1");
                return unit822222;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
