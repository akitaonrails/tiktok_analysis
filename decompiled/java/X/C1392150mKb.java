package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392150mKb extends AbstractC1392160mKc {
    public static Function1<? super Function1<? super C1392140mKa, Unit>, Unit> LLILLL;

    public final void LIZJ(CompletionBlock completionBlock) {
        C2196701AyC.LIZ.getClass();
        HashMap map = new HashMap();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            map.putAll(schemaParserData.LIZLLL());
            String strLJIIIZ = schemaParserData.LJIIIZ();
            if (strLJIIIZ != null) {
                map.put("ttoclid", strLJIIIZ);
            }
        }
        C08S3.LIZLLL("tm_story_share_api_request", map, null, null);
        Function1<? super Function1<? super C1392140mKa, Unit>, Unit> function1 = LLILLL;
        if (function1 != null) {
            function1.invoke(new AwS387S0200000_21(completionBlock, (CompletionBlock<InterfaceC1392170mKd>) this, (C1392150mKb) 67));
        }
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ(completionBlock);
    }
}
