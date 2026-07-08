package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Dup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicI2VHandler$handleRemoveMagic$1", f = "MagicI2VHandler.kt", l = {}, m = "invokeSuspend")
public final class C354330Dup extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C354540DvA LL;
    public final /* synthetic */ C354390Duv LLILLJJLI;
    public final /* synthetic */ NLETrackSlot LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354330Dup(C354540DvA c354540DvA, C354390Duv c354390Duv, NLETrackSlot nLETrackSlot, InterfaceC1364105Vn<? super C354330Dup> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c354540DvA;
        this.LLILLJJLI = c354390Duv;
        this.LLILLL = nLETrackSlot;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C354330Dup(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long endTime;
        long timeClipStart;
        long timeClipEnd;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        Long lLJIILIIL4;
        Long lLJIILIIL5;
        String str;
        C1C7U.LIZ("MagicI2VHandler@3c68.handleRemoveMagic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLJII = C352250DrT.LJII(this.LL.LIZIZ.LIZIZ);
        if (strLJII != null) {
            C354390Duv c354390Duv = this.LLILLJJLI;
            C381540Exc c381540ExcLJFF = c354390Duv.LJFF().LJFF(strLJII);
            if (c381540ExcLJFF != null) {
                str = c381540ExcLJFF.LJ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "FAILED")) {
                c354390Duv.LJFF().LJII(EnumC382030EyP.CANCEL, EnumC2331909Bt.TASK_ID, strLJII, "GenAITaskService");
            } else {
                c354390Duv.LJFF().LJII(EnumC382030EyP.STOP, EnumC2331909Bt.TASK_ID, strLJII, "GenAITaskService");
            }
        }
        NLEEditor nLEEditor = this.LLILLJJLI.LLILLL;
        C354240Dug c354240Dug = this.LL.LIZIZ;
        NLETrackSlot nLETrackSlot = c354240Dug.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        nLETrackSlot.removeExtraWithKey("creation_async_task_id");
        C354260Dui c354260Dui = C354260Dui.LIZ;
        String str2 = c354510Dv7.LIZIZ;
        String str3 = c354510Dv7.LIZJ;
        c354260Dui.getClass();
        C354260Dui.LJ(nLETrackSlot, str2, str3);
        nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
        nLETrackSlot.removeVideoEffect(C354260Dui.LJI(nLETrackSlot));
        nLEEditor.commit();
        NLETrackSlot nLETrackSlot2 = this.LLILLL;
        String extra = nLETrackSlot2.getExtra("slot_extra_origin_duration");
        if (extra != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(extra)) != null) {
            endTime = lLJIILIIL5.longValue();
        } else {
            endTime = nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime();
        }
        nLETrackSlot2.setDuration(endTime);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            String extra2 = nLESegmentVideoDynamicCast.getExtra("slot_extra_origin_clip_start_time");
            if (extra2 != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(extra2)) != null) {
                timeClipStart = lLJIILIIL4.longValue();
            } else {
                timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
            }
            nLESegmentVideoDynamicCast.setTimeClipStart(timeClipStart);
            String extra3 = nLESegmentVideoDynamicCast.getExtra("slot_extra_origin_clip_end_time");
            if (extra3 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(extra3)) != null) {
                timeClipEnd = lLJIILIIL3.longValue();
            } else {
                timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
            }
            nLESegmentVideoDynamicCast.setTimeClipEnd(timeClipEnd);
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource == null) {
                nLESegmentVideoDynamicCast.setCanvasStyle(null);
            } else {
                String extra4 = resource.getExtra("slot_extra_origin_resource_file");
                if (extra4 == null || a0.LJJJIL(extra4)) {
                    extra4 = null;
                }
                String extra5 = resource.getExtra("slot_extra_origin_resource_width");
                if (extra5 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(extra5);
                } else {
                    lLJIILIIL = null;
                }
                String extra6 = resource.getExtra("slot_extra_origin_resource_height");
                if (extra6 != null) {
                    lLJIILIIL2 = C2095008Iq.LJIILIIL(extra6);
                } else {
                    lLJIILIIL2 = null;
                }
                if (extra4 != null) {
                    resource.setResourceType(NLEResType.IMAGE);
                    resource.setResourceFile(extra4);
                    if (lLJIILIIL != null) {
                        resource.setWidth(lLJIILIIL.longValue());
                    }
                    if (lLJIILIIL2 != null) {
                        resource.setHeight(lLJIILIIL2.longValue());
                    }
                } else {
                    nLESegmentVideoDynamicCast.setCanvasStyle(null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MagicI2VHandler@3c68.handleRemoveMagic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
