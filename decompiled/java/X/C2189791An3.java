package X;

import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.internal.AwS399S0200000_33;

/* JADX INFO: renamed from: X.1An3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189791An3 extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(2);
    public final int $t;

    public static C2189791An3 get$arr$(int i) {
        C2189791An3 c2189791An3 = (C2189791An3) arr$.get(i);
        if (c2189791An3 != null) {
            return c2189791An3;
        }
        arr$.compareAndSet(i, null, new C2189791An3(i));
        return (C2189791An3) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2189791An3(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C2189791An3 c2189791An3, Object obj, Object obj2, Object obj3, Object obj4) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null || obj3 != null || obj4 != null) && (!C729510SjV.LJJ(videoRelationBtnAssem.LLL) || obj3 != null)) {
            videoRelationBtnAssem.Gp().vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C2189791An3 c2189791An3, Object obj, Object obj2, Object obj3, Object obj4) {
        Aweme aweme;
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) obj;
        if ((!C300900Bqq.LIZ() || obj2 != null || obj3 != null || obj4 != null) && (aweme = videoRelationBtnAssemV2.LLL) != null) {
            C2276471E8n.LIZIZ.d("VideoRelationBtnAssemV2", "play the video for the first time, extend follow button");
            if (!C729510SjV.LJJ(videoRelationBtnAssemV2.LLL) || obj3 != null) {
                VideoRelationBtnVMV2 videoRelationBtnVMV2Ip = videoRelationBtnAssemV2.Ip();
                videoRelationBtnVMV2Ip.getClass();
                videoRelationBtnVMV2Ip.withState(new AwS399S0200000_33(videoRelationBtnVMV2Ip, aweme, 41));
            }
        }
        return Unit.LIZ;
    }
}
