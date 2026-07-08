package android.support.v4.media;

import X.C1ATQ;
import X.C2188811AlT;
import X.C2189641Amo;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C2189641Amo(0);
    public Object mRatingObj;
    public final int mRatingStyle;
    public final float mRatingValue;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rating:style=");
        sbLIZ.append(this.mRatingStyle);
        sbLIZ.append(" rating=");
        float f = this.mRatingValue;
        sbLIZ.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.mRatingStyle;
    }

    public static RatingCompat LIZ(Object obj) {
        float f;
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iLIZIZ = C1ATQ.LIZIZ(rating);
            if (C1ATQ.LJ(rating)) {
                float f2 = 1.0f;
                switch (iLIZIZ) {
                    case 1:
                        if (!C1ATQ.LIZLLL(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f2);
                        break;
                    case 2:
                        if (!C1ATQ.LJFF(rating)) {
                            f2 = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fLIZJ = C1ATQ.LIZJ(rating);
                        if (iLIZIZ != 3) {
                            if (iLIZIZ != 4) {
                                f = 5.0f;
                            } else {
                                f = 4.0f;
                            }
                        } else {
                            f = 3.0f;
                        }
                        if (fLIZJ >= 0.0f && fLIZJ <= f) {
                            ratingCompat = new RatingCompat(iLIZIZ, fLIZJ);
                        }
                        break;
                    case 6:
                        float fLIZ = C1ATQ.LIZ(rating);
                        if (fLIZ >= 0.0f && fLIZ <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fLIZ);
                        }
                        break;
                    default:
                        return null;
                }
            } else {
                switch (iLIZIZ) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iLIZIZ, -1.0f);
                        break;
                }
            }
            ratingCompat.mRatingObj = obj;
        }
        return ratingCompat;
    }

    public RatingCompat(int i, float f) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
