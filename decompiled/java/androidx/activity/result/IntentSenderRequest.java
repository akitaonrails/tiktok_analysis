package androidx.activity.result;

import X.C1719670uqr;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes27.dex */
public final class IntentSenderRequest implements Parcelable {
    public final Intent fillInIntent;
    public final int flagsMask;
    public final int flagsValues;
    public final IntentSender intentSender;
    public static final C1719670uqr Companion = new Object() { // from class: X.0uqr
    };
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() { // from class: X.0uqp
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.intentSender, i);
        parcel.writeParcelable(this.fillInIntent, i);
        parcel.writeInt(this.flagsMask);
        parcel.writeInt(this.flagsValues);
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }
}
