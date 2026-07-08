package X;

import android.util.Base64;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse;
import com.ss.android.ugc.aweme.music.understanding.api.IContentUnderstandingApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingApi$uploadForUnderstanding$2", f = "ContentUnderstandingApi.kt", l = {59, 77}, m = "invokeSuspend")
public final class C2251808s0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ContentUnderstandingResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2251808s0(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, String str8, InterfaceC1364105Vn<? super C2251808s0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = str8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2251808s0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TypedString typedString;
        byte[] bArrLJ;
        String strEncodeToString;
        int length;
        int length2;
        Object objUploadForUnderstandingHighPriority = obj;
        C1C7U.LIZ("ContentUnderstandingApi@e7c2.uploadForUnderstanding$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(objUploadForUnderstandingHighPriority);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objUploadForUnderstandingHighPriority);
            String str = this.LLILLJJLI;
            TypedByteArray typedByteArray = null;
            if (str != null && str.length() > 0) {
                typedString = new TypedString(str);
            } else {
                typedString = null;
            }
            if (this.LLILLL.length() > 0) {
                bArrLJ = C09BH.LJ(new C0VSJ(this.LLILLL));
            } else {
                bArrLJ = null;
            }
            String str2 = "";
            if (C2252008s2.LIZ()) {
                C1673840tew c1673840tew = C1673840tew.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ContentUnderstandingApi upload binary, size=");
                if (bArrLJ != null) {
                    length = bArrLJ.length;
                } else {
                    length = 0;
                }
                sbLIZ.append(length);
                sbLIZ.append(", localEmbLen=");
                String str3 = this.LLILLJJLI;
                if (str3 != null) {
                    length2 = str3.length();
                } else {
                    length2 = 0;
                }
                sbLIZ.append(length2);
                C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
                IContentUnderstandingApi iContentUnderstandingApi = (IContentUnderstandingApi) C2251908s1.LIZ.getValue();
                TypedString typedString2 = new TypedString(this.LLILZ);
                TypedString typedString3 = new TypedString(this.LLILZIL);
                TypedString typedString4 = new TypedString(this.LLILZLL);
                TypedString typedString5 = new TypedString(this.LLIZ);
                TypedString typedString6 = new TypedString("");
                TypedString typedString7 = new TypedString(this.LLIZLLLIL);
                if (bArrLJ != null) {
                    typedByteArray = new TypedByteArray("application/octet-stream", bArrLJ, new String[0]);
                }
                Integer numLJ = C2286608xc.LJ(this.LLJ);
                Integer numLJ2 = C2286608xc.LJ(this.LLJI);
                Integer numLJ3 = C2286608xc.LJ(this.LLJIJIL);
                String str4 = this.LLJILJIL;
                this.LL = 1;
                objUploadForUnderstandingHighPriority = iContentUnderstandingApi.uploadForUnderstandingHighPriority(typedString2, typedString3, typedString4, typedString5, typedString6, typedString7, typedByteArray, typedString, numLJ, numLJ2, numLJ3, str4, this);
                if (objUploadForUnderstandingHighPriority == objLJFF) {
                    C1C7U.LIZIZ("ContentUnderstandingApi@e7c2.uploadForUnderstanding$2");
                    return objLJFF;
                }
            } else {
                C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
                C201955140j.LJIILJJIL(c1673840tew2, "ContentUnderstandingApi begin encodeToString");
                if (bArrLJ != null && (strEncodeToString = Base64.encodeToString(bArrLJ, 2)) != null) {
                    str2 = strEncodeToString;
                }
                C201955140j.LJIILJJIL(c1673840tew2, "ContentUnderstandingApi end encodeToString");
                IContentUnderstandingApi iContentUnderstandingApi2 = (IContentUnderstandingApi) C2251908s1.LIZ.getValue();
                TypedString typedString8 = new TypedString(this.LLILZ);
                TypedString typedString9 = new TypedString(this.LLILZIL);
                TypedString typedString10 = new TypedString(this.LLILZLL);
                TypedString typedString11 = new TypedString(this.LLIZ);
                TypedString typedString12 = new TypedString(str2);
                TypedString typedString13 = new TypedString(this.LLIZLLLIL);
                Integer numLJ4 = C2286608xc.LJ(this.LLJ);
                Integer numLJ5 = C2286608xc.LJ(this.LLJI);
                Integer numLJ6 = C2286608xc.LJ(this.LLJIJIL);
                String str5 = this.LLJILJIL;
                this.LL = 2;
                objUploadForUnderstandingHighPriority = iContentUnderstandingApi2.uploadForUnderstandingHighPriority(typedString8, typedString9, typedString10, typedString11, typedString12, typedString13, null, typedString, numLJ4, numLJ5, numLJ6, str5, this);
                if (objUploadForUnderstandingHighPriority == objLJFF) {
                    C1C7U.LIZIZ("ContentUnderstandingApi@e7c2.uploadForUnderstanding$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("ContentUnderstandingApi@e7c2.uploadForUnderstanding$2");
        return objUploadForUnderstandingHighPriority;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ContentUnderstandingResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
