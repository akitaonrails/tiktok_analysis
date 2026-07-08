package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.lexical.platform.span.MentionSpan;

/* JADX INFO: renamed from: X.0ZtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913910ZtF implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C913910ZtF(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C913910ZtF c913910ZtF, Parcel parcel) {
        return new AVTextExtraStruct(parcel);
    }

    public static final Object createFromParcel$1(C913910ZtF c913910ZtF, Parcel parcel) {
        return new AiCopyWritingSpan(parcel);
    }

    public static final Object createFromParcel$2(C913910ZtF c913910ZtF, Parcel parcel) {
        return new MentionSpan(parcel);
    }

    public static final Object[] newArray$0(C913910ZtF c913910ZtF, int i) {
        return new AVTextExtraStruct[i];
    }

    public static final Object[] newArray$1(C913910ZtF c913910ZtF, int i) {
        return new AiCopyWritingSpan[i];
    }

    public static final Object[] newArray$2(C913910ZtF c913910ZtF, int i) {
        return new MentionSpan[i];
    }
}
