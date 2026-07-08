package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1454100nwW extends C2217421BqW implements InterfaceC1631620sYq<C1454380nwy, List<? extends CollageInnerImageInfo>, Function2<? super List<? extends NLETrack>, ? super List<? extends CollageInnerImageInfo>, ? extends Unit>, Unit> {
    public C1454100nwW(C1454020nwO c1454020nwO) {
        super(3, c1454020nwO, C1454020nwO.class, "onUseLayout", "onUseLayout(Lcom/ss/android/ugc/aweme/image/collage/model/CollageParam;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C1454380nwy c1454380nwy, List<? extends CollageInnerImageInfo> list, Function2<? super List<? extends NLETrack>, ? super List<? extends CollageInnerImageInfo>, ? extends Unit> function2) {
        ((C1454020nwO) this.receiver).o7(c1454380nwy, list, function2);
        return Unit.LIZ;
    }
}
