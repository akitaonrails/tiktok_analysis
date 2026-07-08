package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.comment.widgets.CommentGroupChatSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentLinkProductSpan;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.ui.HashTagSpan;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan;

/* JADX INFO: renamed from: X.0maW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402020maW implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            default:
                return new Object[0];
        }
    }

    public C1402020maW(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1402020maW c1402020maW, Parcel parcel) {
        return new CommentPreloadRequest(parcel);
    }

    public static final Object createFromParcel$1(C1402020maW c1402020maW, Parcel parcel) {
        return new CommentGroupChatSpan(parcel);
    }

    public static final Object createFromParcel$2(C1402020maW c1402020maW, Parcel parcel) {
        return new CommentLinkProductSpan(parcel.readInt(), parcel);
    }

    public static final Object createFromParcel$3(C1402020maW c1402020maW, Parcel parcel) {
        return new MentionSpan(parcel);
    }

    public static final Object createFromParcel$4(C1402020maW c1402020maW, Parcel parcel) {
        return new HashTagSpan(parcel);
    }

    public static final Object createFromParcel$5(C1402020maW c1402020maW, Parcel parcel) {
        C1370910lmL c1370910lmL = new C1370910lmL();
        c1370910lmL.LIZ(parcel);
        return new BaseSharePackage(c1370910lmL);
    }

    public static final Object createFromParcel$6(C1402020maW c1402020maW, Parcel parcel) {
        return new VideoShare2GifEditContext(parcel);
    }

    public static final Object createFromParcel$7(C1402020maW c1402020maW, Parcel parcel) {
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZJ(parcel);
        return new SharePackage(c1370940lmO);
    }

    public static final Object createFromParcel$8(C1402020maW c1402020maW, Parcel parcel) {
        return new MentionEditText$MentionSpan(parcel);
    }

    public static final Object[] newArray$0(C1402020maW c1402020maW, int i) {
        return new CommentPreloadRequest[i];
    }

    public static final Object[] newArray$1(C1402020maW c1402020maW, int i) {
        return new CommentGroupChatSpan[i];
    }

    public static final Object[] newArray$2(C1402020maW c1402020maW, int i) {
        return new CommentLinkProductSpan[i];
    }

    public static final Object[] newArray$3(C1402020maW c1402020maW, int i) {
        return new MentionSpan[i];
    }

    public static final Object[] newArray$4(C1402020maW c1402020maW, int i) {
        return new HashTagSpan[i];
    }

    public static final Object[] newArray$5(C1402020maW c1402020maW, int i) {
        return new BaseSharePackage[i];
    }

    public static final Object[] newArray$6(C1402020maW c1402020maW, int i) {
        return new VideoShare2GifEditContext[i];
    }

    public static final Object[] newArray$7(C1402020maW c1402020maW, int i) {
        return new SharePackage[i];
    }

    public static final Object[] newArray$8(C1402020maW c1402020maW, int i) {
        return new MentionEditText$MentionSpan[i];
    }
}
