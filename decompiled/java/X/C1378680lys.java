package X;

import Y.AkS326S0200000_19;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.model.ContentPbResponse;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS387S0200000_21;
import njp.a;

/* JADX INFO: renamed from: X.0lys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.jsb.impl.MinisShareToUserMethodIDL$handle$2", f = "MinisShareToUserMethodIDL.kt", l = {84}, m = "invokeSuspend")
public final class C1378680lys extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1058350deD LLILLL;
    public final /* synthetic */ C1378750lyz LLILZ;
    public final /* synthetic */ C1378610lyl LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1058330deB> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378680lys(InterfaceC1058350deD interfaceC1058350deD, C1378750lyz c1378750lyz, C1378610lyl c1378610lyl, C259800zU<String> c259800zU, String str, CompletionBlock<InterfaceC1058330deB> completionBlock, InterfaceC1364105Vn<? super C1378680lys> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1058350deD;
        this.LLILZ = c1378750lyz;
        this.LLILZIL = c1378610lyl;
        this.LLILZLL = c259800zU;
        this.LLIZ = str;
        this.LLIZLLLIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1378680lys(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIILIIL;
        String str;
        String str2;
        int i;
        int iIntValue;
        String str3;
        Context context;
        Object objLIZIZ = obj;
        C1C7U.LIZ("MinisShareToUserMethodIDL@a83.handle$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        String str4 = "";
        if (i2 != 0) {
            if (i2 == 1) {
                strLJIILIIL = (String) this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
            if (iMinisApiService != null) {
                String clientKey = this.LLILLL.getClientKey();
                if (clientKey == null) {
                    clientKey = "";
                }
                strLJIILIIL = iMinisApiService.LJIILIIL(clientKey, this.LLILLL.getOpenid());
                if (strLJIILIIL != null) {
                    C1378750lyz c1378750lyz = this.LLILZ;
                    C1378610lyl c1378610lyl = this.LLILZIL;
                    String str5 = c1378610lyl.LIZLLL;
                    String str6 = c1378610lyl.LIZ;
                    String str7 = c1378610lyl.LIZIZ;
                    String str8 = this.LLILZLL.element;
                    String str9 = c1378610lyl.LIZJ;
                    String str10 = this.LLIZ;
                    Integer num = c1378610lyl.LJFF;
                    String path = this.LLILLL.getPath();
                    c1378750lyz.getClass();
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
                    if (str9 != null) {
                        str = str8;
                    } else {
                        str = null;
                    }
                    if (C2197221Az2.LIZ(str5)) {
                        str2 = "mini_game";
                    } else {
                        str2 = "short_drama";
                    }
                    LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("minisID", str5), new Pair("collectionID", str), new Pair("minisType", str2));
                    IMetaServiceApi iMetaServiceApi = (IMetaServiceApi) c1378750lyz.LLILLL.getValue();
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(linkedHashMapLJII);
                    if (str9 == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C11HW c11hwLJJI = AbstractC19484711Kz.LJIJJ(iMetaServiceApi.getContentPbForDMShare(str5, str6, str7, str8, str9, str10, strLJI, i, iIntValue, path)).LJIIZILJ(new AkS326S0200000_19(c1378750lyz, c259800zU, 9)).LJJI(new InterfaceC1487280oo2() { // from class: X.01XM
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj2) {
                            String string;
                            Throwable th = (Throwable) obj2;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchContentPbForDMShare, error occurred, cause:");
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                string = cause.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ.append(string);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return AbstractC19484711Kz.LJIILLIIL(th);
                        }
                    });
                    this.LL = strLJIILIIL;
                    this.LLILLJJLI = 1;
                    objLIZIZ = C11UD.LIZIZ(c11hwLJJI, this);
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("MinisShareToUserMethodIDL@a83.handle$2");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisShareToUserMethodIDL@a83.handle$2");
            return unit;
        }
        ContentPbResponse contentPbResponse = (ContentPbResponse) ((NetworkResponse) objLIZIZ).data;
        if (contentPbResponse != null && (str3 = contentPbResponse.contentPb) != null) {
            String str11 = contentPbResponse.scene;
            if (str11 != null) {
                str4 = str11;
            }
            if (strLJIILIIL != null && strLJIILIIL.length() != 0 && str3.length() != 0) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", "game_page", bundle);
                C786410Ut5.LJJJI("enter_method", "minis_game_share", bundle);
                C786410Ut5.LJJJI("panel_source", "card_panel", bundle);
                C786410Ut5.LJJJI("content_type", "minis", bundle);
                C786410Ut5.LJJJI("minis_content_type", "game", bundle);
                InterfaceC634840OvC interfaceC634840OvC = this.LLILZ.IBridgeSdkContext;
                if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
                    C1378750lyz c1378750lyz2 = this.LLILZ;
                    CompletionBlock<InterfaceC1058330deB> completionBlock = this.LLIZLLLIL;
                    IInternalShareApi.LIZ.getClass();
                    C1370970lmR.LIZ().LIZ().LIZIZ(strLJIILIIL, context, str3, str4, bundle, new AwS387S0200000_21(c1378750lyz2, (C1378750lyz) completionBlock, (CompletionBlock<InterfaceC1058330deB>) 95));
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MinisShareToUserMethodIDL@a83.handle$2");
                return unit2;
            }
            C2382909Vj.LIZ(this.LLIZLLLIL, 0, "get msg error", null, 4);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MinisShareToUserMethodIDL@a83.handle$2");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("MinisShareToUserMethodIDL@a83.handle$2");
        return unit4;
    }
}
