package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Wl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832410Wl5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iLJJIII = C0W6J.LJJIII(parcel);
        Scope[] scopeArr = GetServiceRequest.LLJILJILJ;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.LLJILLL;
        String strLJII = null;
        Feature[] featureArr2 = featureArr;
        int iLJIJJLI = 0;
        int iLJIJJLI2 = 0;
        int iLJIJJLI3 = 0;
        boolean zLJIILIIL = false;
        int iLJIJJLI4 = 0;
        boolean zLJIILIIL2 = false;
        IBinder iBinderLJIJJ = null;
        Account account = null;
        String strLJII2 = null;
        while (parcel.dataPosition() < iLJJIII) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                    break;
                case 2:
                    iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                    break;
                case 3:
                    iLJIJJLI3 = C0W6J.LJIJJLI(i, parcel);
                    break;
                case 4:
                    strLJII = C0W6J.LJII(i, parcel);
                    break;
                case 5:
                    iBinderLJIJJ = C0W6J.LJIJJ(i, parcel);
                    break;
                case 6:
                    scopeArr = (Scope[]) C0W6J.LJIIJ(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C0W6J.LIZIZ(i, parcel);
                    break;
                case '\b':
                    account = (Account) C0W6J.LJI(parcel, i, Account.CREATOR);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                default:
                    C0W6J.LJJII(i, parcel);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    featureArr = (Feature[]) C0W6J.LJIIJ(parcel, i, Feature.CREATOR);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    featureArr2 = (Feature[]) C0W6J.LJIIJ(parcel, i, Feature.CREATOR);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    iLJIJJLI4 = C0W6J.LJIJJLI(i, parcel);
                    break;
                case 14:
                    zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                    break;
                case 15:
                    strLJII2 = C0W6J.LJII(i, parcel);
                    break;
            }
        }
        C0W6J.LJIIL(iLJJIII, parcel);
        return new GetServiceRequest(iLJIJJLI, iLJIJJLI2, iLJIJJLI3, strLJII, iBinderLJIJJ, scopeArr, bundle, account, featureArr, featureArr2, zLJIILIIL, iLJIJJLI4, zLJIILIIL2, strLJII2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    public static void LIZ(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, getServiceRequest.LL);
        C817940W6u.LJIIJ(parcel, 2, getServiceRequest.LLILLJJLI);
        C817940W6u.LJIIJ(parcel, 3, getServiceRequest.LLILLL);
        C817940W6u.LJIJ(parcel, 4, getServiceRequest.LLILZ, false);
        C817940W6u.LJIIIZ(parcel, 5, getServiceRequest.LLILZIL);
        C817940W6u.LJIJJLI(parcel, 6, getServiceRequest.LLILZLL, i);
        C817940W6u.LIZJ(parcel, 7, getServiceRequest.zzi);
        C817940W6u.LJIIZILJ(parcel, 8, getServiceRequest.LLIZ, i, false);
        C817940W6u.LJIJJLI(parcel, 10, getServiceRequest.LLIZLLLIL, i);
        C817940W6u.LJIJJLI(parcel, 11, getServiceRequest.LLJ, i);
        C817940W6u.LIZ(parcel, 12, getServiceRequest.LLJI);
        C817940W6u.LJIIJ(parcel, 13, getServiceRequest.LLJIJIL);
        C817940W6u.LIZ(parcel, 14, getServiceRequest.LLJILJIL);
        C817940W6u.LJIJ(parcel, 15, getServiceRequest.zzp, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
