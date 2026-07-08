package X;

import Y.ARunnableS108S0100000_8;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import x5h.d;

/* JADX INFO: renamed from: X.0Mlb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C577930Mlb extends C2217421BqW implements Function1<String, Unit> {
    public final /* synthetic */ ShortVideoContext LL;
    public final /* synthetic */ d LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C577930Mlb(ShortVideoContext shortVideoContext, d dVar) {
        super(1, C1449605lu.class, "onBitmapSaved", "handleTemplatePhoto$lambda$6$onBitmapSaved(Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;Lcom/ss/android/ugc/aweme/photo/processor/OptimizeTakePhotoProcessor;Ljava/lang/String;)V", 0);
        this.LL = shortVideoContext;
        this.LLILLJJLI = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ShortVideoContext shortVideoContext = this.LL;
        d dVar = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = d.LJJ;
        C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(shortVideoContext.creativeInfo, EnumC20228214Cy.PHOTO_MODE_TEMPLATE, C1449640npK.LIZ(".jpg"), true);
        C2286708xd.LJFF(str, c0vsjLIZJ.getPath());
        C1440005kM.LIZ(new C522580KeW(c0vsjLIZJ.getAbsolutePath()));
        if (C539900LFk.LIZ(shortVideoContext)) {
            C201955140j.LIZLLL(C201967140v.LIZIZ, "OptimizeTakePhotoProcessor", "Calling onTakePhoto on CameraVideoTemplateApiComponent");
            Pair pair = new Pair(c0vsjLIZJ.getAbsolutePath(), null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(dVar, (d) arrayList, (ArrayList<Pair<String, String>>) 151));
        } else if (C295700BiS.LIZ() && "ugc_template".equals(shortVideoContext.shootWay)) {
            C0CNO.LIZLLL(0L, new AwS552S0100000_8(dVar, 1117));
        } else {
            Scene scene = (Scene) dVar.LJIJI.getValue(dVar, d.LJJ[0]);
            if (scene == null || LifecycleOwnerExtensionsKt.LIZJ(scene, new ARunnableS108S0100000_8(dVar, 149)) == null) {
                dVar.LIZ.finish();
            }
        }
        return Unit.LIZ;
    }
}
