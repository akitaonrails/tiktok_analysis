package X;

import android.graphics.PointF;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.chromakey.ChromaKeyComponent$addChroma$2", f = "ChromaKeyComponent.kt", l = {}, m = "invokeSuspend")
public final class C356480DyI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C374020ElU LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ PointF LLILLL;
    public final /* synthetic */ EnumC356070Dxd LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C356480DyI(C374020ElU c374020ElU, C0E48 c0e48, PointF pointF, EnumC356070Dxd enumC356070Dxd, long j, InterfaceC1364105Vn<? super C356480DyI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c374020ElU;
        this.LLILLJJLI = c0e48;
        this.LLILLL = pointF;
        this.LLILZ = enumC356070Dxd;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C356480DyI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ResourceItem resourceItemBa1;
        NLETrackSlot nLETrackSlotLJIIJJI;
        ColorPickerInfo colorPickerInfo;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        String path;
        C1C7U.LIZ("ChromaKeyComponent@1d39.addChroma$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC373920ElK interfaceC373920ElKD5 = this.LL.d5();
        String resourceId = null;
        if (interfaceC373920ElKD5 != null) {
            resourceItemBa1 = interfaceC373920ElKD5.Ba1();
        } else {
            resourceItemBa1 = null;
        }
        C357270DzZ c357270DzZX5 = this.LL.x5();
        if (c357270DzZX5 != null && (nLETrackSlotLJIIJJI = c357270DzZX5.LJIIJJI()) != null) {
            long micros = 0;
            if (!C351220Dpo.LLJJIJIL(nLETrackSlotLJIIJJI)) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLJIIJJI.getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    micros = nLESegmentVideoDynamicCast.getTimeClipStart();
                }
                micros += TimeUnit.MILLISECONDS.toMicros(this.LLILLJJLI.getPlayer().Jh());
            }
            PointF pointF = this.LLILLL;
            if (pointF != null) {
                colorPickerInfo = new ColorPickerInfo(C2286608xc.LIZLLL(pointF.x), C2286608xc.LIZLLL(this.LLILLL.y), C2286608xc.LJFF(micros));
            } else {
                colorPickerInfo = null;
            }
            C0E48 c0e48 = this.LLILLJJLI;
            if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
                float f = this.LL.T2().LIZLLL;
                float f2 = this.LL.T2().LJ;
                if (resourceItemBa1 != null) {
                    path = resourceItemBa1.getPath();
                    resourceId = resourceItemBa1.getResourceId();
                } else {
                    path = null;
                }
                EnumC356070Dxd enumC356070Dxd = this.LLILZ;
                if (enumC356070Dxd == null) {
                    enumC356070Dxd = EnumC356070Dxd.COMMIT;
                }
                interfaceC351350Dq1LLFII.LJLLL(nLETrackSlotLJIIJJI, this.LLILZIL, f, f2, resourceId, path, colorPickerInfo, enumC356070Dxd);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChromaKeyComponent@1d39.addChroma$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChromaKeyComponent@1d39.addChroma$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
