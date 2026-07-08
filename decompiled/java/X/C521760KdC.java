package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SheetOptions;

/* JADX INFO: renamed from: X.0KdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521760KdC implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public C521760KdC(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C521760KdC c521760KdC, Parcel parcel) {
        return new RoomStatus(parcel);
    }

    public static final Object createFromParcel$1(C521760KdC c521760KdC, Parcel parcel) {
        return new EmoteModel(parcel);
    }

    public static final Object createFromParcel$2(C521760KdC c521760KdC, Parcel parcel) {
        return new LiveCoreSDKData.Quality(parcel);
    }

    public static final Object createFromParcel$3(C521760KdC c521760KdC, Parcel parcel) {
        return new EnterRoomLinkSession(parcel);
    }

    public static final Object createFromParcel$4(C521760KdC c521760KdC, Parcel parcel) {
        return new Event(parcel);
    }

    public static final Object createFromParcel$5(C521760KdC c521760KdC, Parcel parcel) {
        boolean z;
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.sheetStyle = parcel.readInt();
        sheetOptions.cornerRadiusPx = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        sheetOptions.isDraggable = z;
        sheetOptions.dimBehindType = parcel.readInt();
        return sheetOptions;
    }

    public static final Object[] newArray$0(C521760KdC c521760KdC, int i) {
        return new RoomStatus[i];
    }

    public static final Object[] newArray$1(C521760KdC c521760KdC, int i) {
        return new EmoteModel[i];
    }

    public static final Object[] newArray$2(C521760KdC c521760KdC, int i) {
        return new LiveCoreSDKData.Quality[i];
    }

    public static final Object[] newArray$3(C521760KdC c521760KdC, int i) {
        return new EnterRoomLinkSession[i];
    }

    public static final Object[] newArray$4(C521760KdC c521760KdC, int i) {
        return new Event[i];
    }

    public static final Object[] newArray$5(C521760KdC c521760KdC, int i) {
        return new SheetOptions[i];
    }
}
