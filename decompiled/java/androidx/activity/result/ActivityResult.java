package androidx.activity.result;

import X.C19FN;
import X.C21523519Ld;
import X.C2188811AlT;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes33.dex */
public final class ActivityResult implements Parcelable {
    public final Intent data;
    public final int resultCode;
    public static final C19FN Companion = new Object() { // from class: X.19FN
    };
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C21523519Ld(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityResult{resultCode=");
        C19FN c19fn = Companion;
        int i = this.resultCode;
        c19fn.getClass();
        sbLIZ.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActivityResult(int i, Intent intent) {
        this.resultCode = i;
        this.data = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.resultCode);
        if (this.data == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.data;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
