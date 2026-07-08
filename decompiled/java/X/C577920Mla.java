package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS409S0200000_8;
import x5h.d;

/* JADX INFO: renamed from: X.0Mla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C577920Mla extends C2217421BqW implements Function1<String, Unit> {
    public final /* synthetic */ ShortVideoContext LL;
    public final /* synthetic */ d LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C577920Mla(ShortVideoContext shortVideoContext, d dVar) {
        super(1, C1449605lu.class, "onBitmapSaved", "handleAIGCPhoto$lambda$8$onBitmapSaved$7(Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;Lcom/ss/android/ugc/aweme/photo/processor/OptimizeTakePhotoProcessor;Ljava/lang/String;)V", 0);
        this.LL = shortVideoContext;
        this.LLILLJJLI = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        AbstractC577770MlL c577810MlP;
        ShortVideoContext shortVideoContext = this.LL;
        d dVar = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = d.LJJ;
        C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(shortVideoContext.creativeInfo, EnumC20228214Cy.EDITOR_PRO_AIGC, C1449640npK.LIZ(".jpg"), true);
        C2286708xd.LJFF(str, c0vsjLIZJ.getPath());
        if (shortVideoContext.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground) {
            c577810MlP = new C577820MlQ(dVar.LIZ, new C577850MlT(shortVideoContext, false, c0vsjLIZJ.getPath()));
        } else {
            c577810MlP = new C577810MlP(dVar.LIZ, new C577850MlT(shortVideoContext, false, c0vsjLIZJ.getPath()));
        }
        C0CNO.LIZLLL(0L, new AwS409S0200000_8(dVar, (d) c577810MlP, (AbstractC577770MlL<Unit>) 150));
        return Unit.LIZ;
    }
}
