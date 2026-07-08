package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351920Dqw extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ NLESegmentVideo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C352420Drk LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<ArrayList<NLETrackSlot>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C351920Dqw(NLESegmentVideo nLESegmentVideo, boolean z, C352420Drk c352420Drk, int i, String str, Context context, boolean z2, Function1<? super ArrayList<NLETrackSlot>, Unit> function1) {
        super(1);
        this.LL = nLESegmentVideo;
        this.LLILLJJLI = z;
        this.LLILLL = c352420Drk;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = context;
        this.LLIZ = z2;
        this.LLIZLLLIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        NLEResourceAV aVFile;
        String str2 = str;
        NLESegmentVideo nLESegmentVideo = this.LL;
        if (nLESegmentVideo != null && (aVFile = nLESegmentVideo.getAVFile()) != null) {
            aVFile.setResourceFile(str2);
        }
        NLESegmentVideo nLESegmentVideo2 = this.LL;
        if (nLESegmentVideo2 != null) {
            nLESegmentVideo2.getTimeClipStart();
            this.LL.getTimeClipEnd();
            if (!this.LLILLJJLI) {
                long timeClipEnd = this.LL.getTimeClipEnd() - this.LL.getTimeClipStart();
                this.LL.setTimeClipStart(0L);
                this.LL.setTimeClipEnd(timeClipEnd);
                NLEResourceNode resource = this.LL.getResource();
                if (resource != null) {
                    resource.setDuration(timeClipEnd);
                }
            } else {
                NLEResourceNode resource2 = this.LL.getResource();
                if (resource2 != null) {
                    resource2.setDuration(this.LL.getTimeClipEnd());
                }
            }
        }
        C352420Drk c352420Drk = this.LLILLL;
        int i = this.LLILZ;
        String str3 = this.LLILZIL;
        Context context = this.LLILZLL;
        boolean z = this.LLIZ;
        Function1<ArrayList<NLETrackSlot>, Unit> function1 = this.LLIZLLLIL;
        int i2 = i + 1;
        if (i2 < c352420Drk.LIZJ.size()) {
            c352420Drk.LIZJ(i2, context, str3, function1, z);
        } else {
            function1.invoke(c352420Drk.LIZJ);
        }
        return Unit.LIZ;
    }
}
