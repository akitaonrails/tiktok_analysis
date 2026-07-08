package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590430NDt extends C09AY implements Function0<Keva> {
    public C590430NDt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        C844470XAv.LIZ.getClass();
        return KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "feed_video_cache", 1);
    }
}
