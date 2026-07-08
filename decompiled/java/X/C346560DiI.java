package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: X.0DiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346560DiI extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(7);
    public final int $t;

    public static C346560DiI get$arr$(int i) {
        C346560DiI c346560DiI = (C346560DiI) arr$.get(i);
        if (c346560DiI != null) {
            return c346560DiI;
        }
        arr$.compareAndSet(i, null, new C346560DiI(i));
        return (C346560DiI) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346560DiI(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(C351420Dq8.LIZLLL((NLEModel) obj2));
    }

    public static final Object invoke$1(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(C351220Dpo.LLLIL((NLETrackSlot) obj4));
    }

    public static final Object invoke$2(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj4;
        boolean z = false;
        if (nLETrackSlot != null) {
            Float fLJIILIIL = C351220Dpo.LJIILIIL(nLETrackSlot);
            if (fLJIILIIL == null || fLJIILIIL.floatValue() == 1.0f) {
                z = true;
            }
            z = !z;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(C351220Dpo.LLIZLLLIL((NLETrackSlot) obj4));
    }

    public static final Object invoke$4(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj4;
        boolean z = true;
        if (nLETrackSlot.getAIMatting() == null || !C351220Dpo.LLJLLL(nLETrackSlot)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(C351220Dpo.LIZLLL((NLEModel) obj2));
    }

    public static final Object invoke$6(C346560DiI c346560DiI, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        NLEModel nLEModel = (NLEModel) obj2;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj4;
        if (((VideoPublishEditModel) obj).creativeModel.publishModel.bindFreezeFrameSlot && C346840Dik.LIZIZ(nLEModel, nLETrackSlot)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
