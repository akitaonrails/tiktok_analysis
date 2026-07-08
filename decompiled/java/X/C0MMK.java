package X;

import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0MMK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MMK implements Serializable {
    public final VideoShareInfoStruct LL;
    public final MentionStruct LLILLJJLI;

    public MentionStruct getVideoShareBackwardsMentionStruct() {
        return this.LLILLJJLI;
    }

    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.LL;
    }

    public C0MMK(VideoShareInfoStruct videoShareInfoStruct, MentionStruct mentionStruct, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = videoShareInfoStruct;
        this.LLILLJJLI = mentionStruct;
    }
}
