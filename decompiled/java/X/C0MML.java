package X;

import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;

/* JADX INFO: renamed from: X.0MML, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MML extends C0MMK {

    @C040H
    public final boolean LLILLL;

    @C040H
    public final boolean LLILZ;

    public C0MML() {
        this(null, null, false, false);
    }

    public final boolean getUseCanVasNewStyle() {
        return this.LLILLL;
    }

    public final boolean getUseStreamingEntry() {
        return this.LLILZ;
    }

    public C0MML(VideoShareInfoStruct videoShareInfoStruct, MentionStruct mentionStruct, boolean z, boolean z2) {
        super(videoShareInfoStruct, mentionStruct, null);
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
