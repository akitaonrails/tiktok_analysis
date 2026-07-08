package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.websocket.internal.proto.Frame;
import com.ss.bytenn.LossInfo;
import com.ss.bytenn.Tensor;
import java.io.IOException;

/* JADX INFO: renamed from: X.0qYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554390qYH implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C1554390qYH(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1554390qYH c1554390qYH, Parcel parcel) {
        LiveWsMessage.MsgHeader msgHeader = new LiveWsMessage.MsgHeader();
        msgHeader.key = parcel.readString();
        msgHeader.value = parcel.readString();
        return msgHeader;
    }

    public static final Object createFromParcel$1(C1554390qYH c1554390qYH, Parcel parcel) {
        return new LiveWsMessage(parcel);
    }

    public static final Object createFromParcel$2(C1554390qYH c1554390qYH, Parcel parcel) {
        return new HttpHeader(parcel);
    }

    public static final Object createFromParcel$3(C1554390qYH c1554390qYH, Parcel parcel) {
        return new PreloadExtraInfo(parcel);
    }

    public static final Object createFromParcel$4(C1554390qYH c1554390qYH, Parcel parcel) {
        try {
            return Frame.ADAPTER.decode(parcel.createByteArray());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static final Object createFromParcel$5(C1554390qYH c1554390qYH, Parcel parcel) {
        return new LossInfo(parcel);
    }

    public static final Object createFromParcel$6(C1554390qYH c1554390qYH, Parcel parcel) {
        return new Tensor(parcel);
    }

    public static final Object[] newArray$0(C1554390qYH c1554390qYH, int i) {
        return new LiveWsMessage.MsgHeader[i];
    }

    public static final Object[] newArray$1(C1554390qYH c1554390qYH, int i) {
        return new LiveWsMessage[i];
    }

    public static final Object[] newArray$2(C1554390qYH c1554390qYH, int i) {
        return new HttpHeader[i];
    }

    public static final Object[] newArray$3(C1554390qYH c1554390qYH, int i) {
        return new PreloadExtraInfo[i];
    }

    public static final Object[] newArray$4(C1554390qYH c1554390qYH, int i) {
        return new Frame[i];
    }

    public static final Object[] newArray$5(C1554390qYH c1554390qYH, int i) {
        return new LossInfo[i];
    }

    public static final Object[] newArray$6(C1554390qYH c1554390qYH, int i) {
        return new Tensor[i];
    }
}
