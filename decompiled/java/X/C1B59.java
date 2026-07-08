package X;

import android.content.ContentValues;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B59, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B59 extends Binder implements InterfaceC2199171B5f {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B59() {
        attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            int i3 = 0;
            boolean z = false;
            i3 = 0;
            C1B5G c1b5g = null;
            DownloadInfo downloadInfoCreateFromParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    ((C1B58) this).N(z);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    try {
                        if (((C1B58) this).getDownloadInfo(parcel.readInt()) != null) {
                            i3 = 1;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    DownloadInfo downloadInfo = ((C1B58) this).getDownloadInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadInfo != null) {
                        parcel2.writeInt(1);
                        downloadInfo.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> downloadInfoList = ((C1B58) this).getDownloadInfoList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfoList);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> successedDownloadInfosWithMimeType = ((C1B58) this).getSuccessedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> unCompletedDownloadInfosWithMimeType = ((C1B58) this).getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> downloadInfosByFileExtension = ((C1B58) this).getDownloadInfosByFileExtension(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfosByFileExtension);
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    List<DownloadInfo> allDownloadInfo = ((C1B58) this).getAllDownloadInfo();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(allDownloadInfo);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean zUpdateDownloadInfo = ((C1B58) this).updateDownloadInfo(downloadInfoCreateFromParcel);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateDownloadInfo ? 1 : 0);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJIILLIIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJIIIIZZ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).clearData();
                    parcel2.writeNoException();
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    C1B58 c1b58 = (C1B58) this;
                    c1b58.LJJJI(parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJZZI(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 16:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJJ(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJJJ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJLIIIJLLLLLLLZ(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJIJIIJI(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    int i4 = parcel.readInt();
                    long j = parcel.readLong();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, (Integer) (-4));
                    contentValues.put("curBytes", Long.valueOf(j));
                    ((C1B58) this).s1(i4, contentValues);
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJIJ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    ((C1B58) this).LJJIIJ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z2 = ((C1B58) this).LLILZ;
                    parcel2.writeNoException();
                    parcel2.writeInt(z2 ? 1 : 0);
                    return true;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 25:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (parcel.readInt() != 0) {
                        DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    final IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof C1B5G)) {
                            c1b5g = (C1B5G) iInterfaceQueryLocalInterface;
                        } else {
                            c1b5g = new C1B5G(strongBinder) { // from class: X.1B5J
                                public final IBinder LL;

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = strongBinder;
                                }

                                @Override // X.C1B5G
                                public final void LJLLL(Map map, Map map2, Map map3) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                                        parcelObtain.writeMap(map);
                                        parcelObtain.writeMap(map2);
                                        parcelObtain.writeMap(map3);
                                        this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th2;
                                    }
                                }
                            };
                        }
                    }
                    ((C1B58) this).LLILZIL = c1b5g;
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        return true;
    }
}
