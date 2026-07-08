package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.socialavatar.network.socialavatar.BatchTnsResponse;
import com.ss.android.ugc.aweme.socialavatar.network.socialavatar.TnsResponseExtra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator$timeoutAction$2", f = "SocialAvatarGenerator.kt", l = {778}, m = "invokeSuspend")
public final class C439300HKm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>>, Object> {
    public int LL;
    public final /* synthetic */ List<DMUploadImageResult> LLILLJJLI;
    public final /* synthetic */ EnumC439310HKn LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439300HKm(List<DMUploadImageResult> list, EnumC439310HKn enumC439310HKn, String str, long j, InterfaceC1364105Vn<? super C439300HKm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = enumC439310HKn;
        this.LLILZ = str;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439300HKm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String uri;
        String uri2;
        DMEncryptedImageContent dMEncryptedImageContent;
        DMEncryptedImageContent dMEncryptedImageContent2;
        String str;
        EnumC439270HKj enumC439270HKj;
        EnumC439250HKh enumC439250HKh;
        Object objLJI = obj;
        C1C7U.LIZ("SocialAvatarGenerator@55bc.timeoutAction$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String uri3 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C0HLI.LIZJ++;
            C0HMP c0hmp = C0HLI.LIZIZ;
            List<DMUploadImageResult> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (DMUploadImageResult dMUploadImageResult : list) {
                DMEncryptedImageContent dMEncryptedImageContent3 = dMUploadImageResult.decryptData;
                if (dMEncryptedImageContent3 != null && dMEncryptedImageContent3.getUri() != null) {
                    DMEncryptedImageContent dMEncryptedImageContent4 = dMUploadImageResult.decryptData;
                    if (dMEncryptedImageContent4 != null) {
                        uri = dMEncryptedImageContent4.getUri();
                    } else {
                        uri = null;
                    }
                } else {
                    uri = "";
                }
                arrayList.add(uri);
            }
            this.LL = 1;
            c0hmp.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0HMT(arrayList, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarGenerator@55bc.timeoutAction$2");
                return objLJFF;
            }
        }
        BatchTnsResponse batchTnsResponse = (BatchTnsResponse) objLJI;
        boolean zLIZ = false;
        String str2 = "fail";
        if (!Intrinsics.LJFF(batchTnsResponse.isTnsPassed(), true)) {
            TnsResponseExtra tnsResponseExtra = batchTnsResponse.extra;
            if (tnsResponseExtra != null && tnsResponseExtra.logId != null) {
                str = tnsResponseExtra.logId;
            } else {
                str = "null";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("batch tns failed ");
            sbLIZ.append(str);
            sbLIZ.append(" errorCode:");
            sbLIZ.append(batchTnsResponse.errorCode);
            sbLIZ.append(" statusCode:");
            sbLIZ.append(batchTnsResponse.errorCode);
            sbLIZ.append(" logid: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0HLI c0hli = C0HLI.LIZ;
            EnumC439310HKn enumC439310HKn = this.LLILLL;
            c0hli.getClass();
            C0HLI.LJIIJ(enumC439310HKn, "fail");
            String str3 = this.LLILZ;
            if (str3 != null) {
                zLIZ = C1956107lP.LIZ(str3);
            }
            C0HWW c0hww = C0HWW.LIZ;
            String param = this.LLILLL.getParam();
            Float fLIZLLL = C2286608xc.LIZLLL(SystemClock.elapsedRealtime() - this.LLILZIL);
            c0hww.getClass();
            C0HWW.LJJIII("fail", param, zLIZ, "tns_check", fLIZLLL, "tns check fail");
            Integer num = batchTnsResponse.errorCode;
            if (num == null || num.intValue() == 3002442) {
                enumC439270HKj = EnumC439270HKj.FAILURE_IMAGE_TNS_CHECK;
            } else if (num.intValue() == 3002443) {
                enumC439270HKj = EnumC439270HKj.FAILURE_IMAGE_FACE_DETECTION_CHECK;
            } else if (num.intValue() == 3002444) {
                enumC439270HKj = EnumC439270HKj.FAILURE_IMAGE_INTERNAL_ERROR;
            } else {
                enumC439270HKj = EnumC439270HKj.FAILURE_IMAGE_TNS_CHECK;
            }
            Integer num2 = batchTnsResponse.errorCode;
            if (num2 != null && num2.intValue() != 3002442) {
                if (num2.intValue() != 3002443) {
                    if (num2.intValue() == 3002444) {
                        enumC439250HKh = EnumC439250HKh.FAILURE_IMAGE_INTERNAL_ERROR;
                    } else {
                        enumC439250HKh = EnumC439250HKh.FAILURE_IMAGE_TNS_CHECK;
                    }
                } else {
                    enumC439250HKh = EnumC439250HKh.FAILURE_IMAGE_FACE_DETECTION_CHECK;
                }
            } else {
                enumC439250HKh = EnumC439250HKh.FAILURE_IMAGE_TNS_CHECK;
            }
            throw new C0HKQ(enumC439270HKj, enumC439250HKh, strLIZIZ);
        }
        String str4 = batchTnsResponse.generationUri;
        DMUploadImageResult dMUploadImageResult2 = (DMUploadImageResult) C13LP.LJJJLZIJ(1, this.LLILLJJLI);
        if (dMUploadImageResult2 != null && (dMEncryptedImageContent2 = dMUploadImageResult2.decryptData) != null) {
            uri2 = dMEncryptedImageContent2.getUri();
        } else {
            uri2 = null;
        }
        if (Intrinsics.LJFF(str4, uri2)) {
            str2 = "normalized";
        } else {
            DMUploadImageResult dMUploadImageResult3 = (DMUploadImageResult) C13LP.LJJJLZIJ(2, this.LLILLJJLI);
            if (dMUploadImageResult3 != null && (dMEncryptedImageContent = dMUploadImageResult3.decryptData) != null) {
                uri3 = dMEncryptedImageContent.getUri();
            }
            if (Intrinsics.LJFF(str4, uri3)) {
                str2 = "cropped";
            }
        }
        C0HLI c0hli2 = C0HLI.LIZ;
        EnumC439310HKn enumC439310HKn2 = this.LLILLL;
        c0hli2.getClass();
        C0HLI.LJIIJ(enumC439310HKn2, str2);
        String str5 = this.LLILZ;
        if (str5 != null) {
            zLIZ = C1956107lP.LIZ(str5);
        }
        C0HWW c0hww2 = C0HWW.LIZ;
        String param2 = this.LLILLL.getParam();
        Float fLIZLLL2 = C2286608xc.LIZLLL(SystemClock.elapsedRealtime() - this.LLILZIL);
        c0hww2.getClass();
        C0HWW.LJJIII("success", param2, zLIZ, "tns_check", fLIZLLL2, null);
        List listSingletonList = Collections.singletonList(new DMUploadImageResult(new DMEncryptedImageContent(batchTnsResponse.generationUri, null, null, null), 1));
        C1C7U.LIZIZ("SocialAvatarGenerator@55bc.timeoutAction$2");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends DMUploadImageResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
