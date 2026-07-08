package X;

import android.app.Notification;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: renamed from: X.1B7A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public abstract class C1B7A extends Binder implements C1B7C {
    public static final /* synthetic */ int LL = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public C1B7A() {
        attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (i != 1598968902) {
            AbstractBinderC19860312nB abstractBinderC19860312nB = null;
            InterfaceC2199581B6u interfaceC2199581B6u = null;
            DownloadInfo downloadInfo = null;
            DownloadInfo downloadInfoCreateFromParcel = null;
            Notification notification = null;
            DownloadInfo downloadInfoCreateFromParcel2 = null;
            InterfaceC2199541B6q interfaceC2199541B6q = null;
            C1B5M c1b5m = null;
            C1B69 c1b69 = null;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int iLJIILJJIL = 0;
            boolean z10 = false;
            boolean z11 = false;
            ?? r3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    final IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2199581B6u)) {
                            interfaceC2199581B6u = (InterfaceC2199581B6u) iInterfaceQueryLocalInterface;
                        } else {
                            interfaceC2199581B6u = new InterfaceC2199581B6u(strongBinder) { // from class: X.1B6F
                                public final IBinder LL;

                                @Override // X.InterfaceC2199581B6u
                                public final int A() {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(14, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        int i3 = parcelObtain2.readInt();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return i3;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2199491B6l LJJII() {
                                    InterfaceC2199491B6l interfaceC2199491B6l;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(12, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        final IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            interfaceC2199491B6l = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                                            interfaceC2199491B6l = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC2199491B6l)) ? new InterfaceC2199491B6l(strongBinder2) { // from class: X.1B6H
                                                public final IBinder LL;

                                                @Override // X.InterfaceC2199491B6l
                                                public final int[] b1() {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                                                        this.LL.transact(3, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        int[] iArrCreateIntArray = parcelObtain4.createIntArray();
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return iArrCreateIntArray;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }

                                                @Override // X.InterfaceC2199491B6l
                                                public final String getEventPage() {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                                                        this.LL.transact(2, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        String string = parcelObtain4.readString();
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return string;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }

                                                @Override // X.InterfaceC2199491B6l
                                                public final void Q0(String str) {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                                                        parcelObtain3.writeString(str);
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }
                                            } : (InterfaceC2199491B6l) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2199491B6l;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final C1B6N LLILLJJLI() {
                                    C1B6N c1b6n;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(10, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        final IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            c1b6n = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                                            c1b6n = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C1B6N)) ? new C1B6N(strongBinder2) { // from class: X.1B6I
                                                public final IBinder LL;

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }

                                                @Override // X.C1B6N
                                                public final long LJJJJZI(int i3, int i4) {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                                                        parcelObtain3.writeInt(i3);
                                                        parcelObtain3.writeInt(i4);
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        long j = parcelObtain4.readLong();
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return j;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }
                                            } : (C1B6N) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c1b6n;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2199311B5t LLLZIIL() {
                                    InterfaceC2199311B5t interfaceC2199311B5t;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(9, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            interfaceC2199311B5t = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                                            interfaceC2199311B5t = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC2199311B5t)) ? new InterfaceC2199311B5t(strongBinder2) { // from class: X.1B5q
                                                public final IBinder LL;

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }

                                                @Override // X.InterfaceC2199311B5t
                                                public final boolean H(InterfaceC2199241B5m interfaceC2199241B5m) {
                                                    IBinder iBinderAsBinder;
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                                                        if (interfaceC2199241B5m == null) {
                                                            iBinderAsBinder = null;
                                                        } else {
                                                            iBinderAsBinder = interfaceC2199241B5m.asBinder();
                                                        }
                                                        parcelObtain3.writeStrongBinder(iBinderAsBinder);
                                                        boolean z12 = false;
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        if (parcelObtain4.readInt() != 0) {
                                                            z12 = true;
                                                        }
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return z12;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }
                                            } : (InterfaceC2199311B5t) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2199311B5t;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final C1B63 Mh() {
                                    C1B63 c1b63;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(8, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            c1b63 = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                                            c1b63 = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C1B63)) ? new C1B63(strongBinder2) { // from class: X.1B62
                                                public final IBinder LL;

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }

                                                @Override // X.C1B63
                                                public final void monitorLogSend(DownloadInfo downloadInfo2, BaseException baseException, int i3) {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                                                        if (downloadInfo2 != null) {
                                                            parcelObtain3.writeInt(1);
                                                            downloadInfo2.writeToParcel(parcelObtain3, 0);
                                                        } else {
                                                            parcelObtain3.writeInt(0);
                                                        }
                                                        if (baseException != null) {
                                                            parcelObtain3.writeInt(1);
                                                            baseException.writeToParcel(parcelObtain3, 0);
                                                        } else {
                                                            parcelObtain3.writeInt(0);
                                                        }
                                                        parcelObtain3.writeInt(i3);
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }
                                            } : (C1B63) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c1b63;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final C1B6B X() {
                                    C1B6B c1b68;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(6, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            c1b68 = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                                            c1b68 = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C1B6B)) ? new C1B68(strongBinder2) : (C1B6B) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c1b68;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final DownloadInfo getDownloadInfo() {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        DownloadInfo downloadInfoCreateFromParcel3 = parcelObtain2.readInt() != 0 ? DownloadInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return downloadInfoCreateFromParcel3;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC19860412nC getFileProvider() {
                                    InterfaceC19860412nC c19860212nA;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(13, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            c19860212nA = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                                            c19860212nA = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC19860412nC)) ? new C19860212nA(strongBinder2) : (InterfaceC19860412nC) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c19860212nA;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final C1B6M getInterceptor() {
                                    C1B6M c1b6m;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(7, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        final IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            c1b6m = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                                            c1b6m = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof C1B6M)) ? new C1B6M(strongBinder2) { // from class: X.1B6K
                                                public final IBinder LL;

                                                @Override // X.C1B6M
                                                public final boolean LJIILIIL() {
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        boolean z12 = parcelObtain4.readInt() != 0;
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return z12;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }
                                            } : (C1B6M) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c1b6m;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final C1B5O k() {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(5, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        C1B5O c1b5oLJJJZ = C1B5M.LJJJZ(parcelObtain2.readStrongBinder());
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return c1b5oLJJJZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2199401B6c q() {
                                    InterfaceC2199401B6c interfaceC2199401B6c;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        this.LL.transact(11, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        final IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 == null) {
                                            interfaceC2199401B6c = null;
                                        } else {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                                            interfaceC2199401B6c = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC2199401B6c)) ? new InterfaceC2199401B6c(strongBinder2) { // from class: X.1B6G
                                                public final IBinder LL;

                                                @Override // android.os.IInterface
                                                public final IBinder asBinder() {
                                                    return this.LL;
                                                }

                                                {
                                                    this.LL = strongBinder2;
                                                }

                                                @Override // X.InterfaceC2199401B6c
                                                public final boolean I0(long j, long j2, InterfaceC2199421B6e interfaceC2199421B6e) {
                                                    IBinder iBinderAsBinder;
                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                    Parcel parcelObtain4 = Parcel.obtain();
                                                    try {
                                                        parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                                                        parcelObtain3.writeLong(j);
                                                        parcelObtain3.writeLong(j2);
                                                        if (interfaceC2199421B6e == null) {
                                                            iBinderAsBinder = null;
                                                        } else {
                                                            iBinderAsBinder = interfaceC2199421B6e.asBinder();
                                                        }
                                                        parcelObtain3.writeStrongBinder(iBinderAsBinder);
                                                        boolean z12 = false;
                                                        this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                        parcelObtain4.readException();
                                                        if (parcelObtain4.readInt() != 0) {
                                                            z12 = true;
                                                        }
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        return z12;
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain4.recycle();
                                                        parcelObtain3.recycle();
                                                        throw th;
                                                    }
                                                }
                                            } : (InterfaceC2199401B6c) iInterfaceQueryLocalInterface2;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2199401B6c;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = strongBinder;
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final int LLLLJ(int i3) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        parcelObtain.writeInt(i3);
                                        this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        int i4 = parcelObtain2.readInt();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return i4;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2200291B9n LLLLLJLJLL(int i3) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        parcelObtain.writeInt(i3);
                                        this.LL.transact(4, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        InterfaceC2200291B9n interfaceC2200291B9nLJJJZ = AbstractBinderC2199511B6n.LJJJZ(parcelObtain2.readStrongBinder());
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2200291B9nLJJJZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2199371B5z P(int i3) {
                                    InterfaceC2199371B5z interfaceC2199371B5z;
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        parcelObtain.writeInt(i3);
                                        this.LL.transact(15, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        IBinder strongBinder2 = parcelObtain2.readStrongBinder();
                                        if (strongBinder2 != null) {
                                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                                            if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC2199371B5z)) {
                                                interfaceC2199371B5z = (InterfaceC2199371B5z) iInterfaceQueryLocalInterface2;
                                            } else {
                                                interfaceC2199371B5z = new InterfaceC2199371B5z(strongBinder2) { // from class: X.1B5v
                                                    public final IBinder LL;

                                                    @Override // android.os.IInterface
                                                    public final IBinder asBinder() {
                                                        return this.LL;
                                                    }

                                                    {
                                                        this.LL = strongBinder2;
                                                    }

                                                    @Override // X.InterfaceC2199371B5z
                                                    public final void LJJLIIJ(DownloadInfo downloadInfo2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                        try {
                                                            parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                                                            if (downloadInfo2 != null) {
                                                                parcelObtain3.writeInt(1);
                                                                downloadInfo2.writeToParcel(parcelObtain3, 0);
                                                            } else {
                                                                parcelObtain3.writeInt(0);
                                                            }
                                                            this.LL.transact(1, parcelObtain3, parcelObtain4, 0);
                                                            parcelObtain4.readException();
                                                            parcelObtain4.recycle();
                                                            parcelObtain3.recycle();
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            parcelObtain4.recycle();
                                                            parcelObtain3.recycle();
                                                            throw th;
                                                        }
                                                    }

                                                    @Override // X.InterfaceC2199371B5z
                                                    public final boolean LJJLL(DownloadInfo downloadInfo2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                        try {
                                                            parcelObtain3.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler");
                                                            boolean z12 = true;
                                                            if (downloadInfo2 == null) {
                                                                parcelObtain3.writeInt(0);
                                                            } else {
                                                                parcelObtain3.writeInt(1);
                                                                downloadInfo2.writeToParcel(parcelObtain3, 0);
                                                            }
                                                            this.LL.transact(2, parcelObtain3, parcelObtain4, 0);
                                                            parcelObtain4.readException();
                                                            if (parcelObtain4.readInt() == 0) {
                                                                z12 = false;
                                                            }
                                                            parcelObtain4.recycle();
                                                            parcelObtain3.recycle();
                                                            return z12;
                                                        } catch (Throwable th) {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            parcelObtain4.recycle();
                                                            parcelObtain3.recycle();
                                                            throw th;
                                                        }
                                                    }
                                                };
                                            }
                                        } else {
                                            interfaceC2199371B5z = null;
                                        }
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2199371B5z;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC2199581B6u
                                public final InterfaceC2200291B9n LLIILZL(int i3, int i4) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                                        parcelObtain.writeInt(i3);
                                        parcelObtain.writeInt(i4);
                                        this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        InterfaceC2200291B9n interfaceC2200291B9nLJJJZ = AbstractBinderC2199511B6n.LJJJZ(parcelObtain2.readStrongBinder());
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        return interfaceC2200291B9nLJJJZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }
                            };
                        }
                    }
                    ((C1B78) this).W(interfaceC2199581B6u);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    ((C1B78) this).LJJLIIIJJI(i3, z8);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    ((C1B78) this).cancel(i4, z9);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zCanResume = ((C1B78) this).canResume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCanResume ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).resume(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).restart(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).pauseAll();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    long curBytes = ((C1B78) this).getCurBytes(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(curBytes);
                    return true;
                case BdTuring.TYPE_ECAF /* 9 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int status = ((C1B78) this).getStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(status);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zIsDownloading = ((C1B78) this).isDownloading(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDownloading ? 1 : 0);
                    return true;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    DownloadInfo downloadInfo2 = ((C1B78) this).getDownloadInfo(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadInfo2 != null) {
                        parcel2.writeInt(1);
                        downloadInfo2.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadInfoList = ((C1B78) this).getDownloadInfoList(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfoList);
                    return true;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (((C1B78) this).LLILLJJLI != null) {
                        iLJIILJJIL = C2199681B7e.LJIILJJIL(string, string2);
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(iLJIILJJIL);
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    C1B79 c1b79 = ((C1B78) this).LLILLJJLI;
                    if (c1b79 != null) {
                        downloadInfo = c1b79.getDownloadInfo(C2199681B7e.LJIILJJIL(string3, string4));
                    }
                    parcel2.writeNoException();
                    if (downloadInfo != null) {
                        parcel2.writeInt(1);
                        downloadInfo.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> successedDownloadInfosWithMimeType = ((C1B78) this).getSuccessedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                    return true;
                case 16:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadingDownloadInfosWithMimeType = ((C1B78) this).getDownloadingDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadingDownloadInfosWithMimeType);
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> downloadInfosByFileExtension = ((C1B78) this).getDownloadInfosByFileExtension(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(downloadInfosByFileExtension);
                    return true;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> allDownloadInfo = ((C1B78) this).getAllDownloadInfo();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(allDownloadInfo);
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).restartAllFailedDownloadTasks(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).restartAllPauseReserveOnWifiDownloadTasks(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i5 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    ((C1B78) this).LJJJJZ(i5, z6, z10);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i6 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    C1B79 c1b792 = ((C1B78) this).LLILLJJLI;
                    if (c1b792 != null) {
                        c1b792.LJJJJZ(i6, z5, false);
                    }
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).forceDownloadIngoreRecommendSize(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i7 = parcel.readInt();
                    int i8 = parcel.readInt();
                    InterfaceC2200291B9n interfaceC2200291B9nLJJJZ = AbstractBinderC2199511B6n.LJJJZ(parcel.readStrongBinder());
                    int i9 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ((C1B78) this).v0(i7, i8, interfaceC2200291B9nLJJJZ, i9, z4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    InterfaceC2200291B9n interfaceC2200291B9nLJJJZ2 = AbstractBinderC2199511B6n.LJJJZ(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ((C1B78) this).LJLJJLL(i10, i11, interfaceC2200291B9nLJJJZ2, i12, z3);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i13 = parcel.readInt();
                    int i14 = parcel.readInt();
                    InterfaceC2200291B9n interfaceC2200291B9nLJJJZ3 = AbstractBinderC2199511B6n.LJJJZ(parcel.readStrongBinder());
                    int i15 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ((C1B78) this).A0(i13, i14, interfaceC2200291B9nLJJJZ3, i15, z, z2);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean zIsDownloadSuccessAndFileNotExist = ((C1B78) this).isDownloadSuccessAndFileNotExist(downloadInfoCreateFromParcel);
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDownloadSuccessAndFileNotExist ? 1 : 0);
                    return true;
                case 28:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i16 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                    }
                    ((C1B78) this).LJLI(i16, notification);
                    return true;
                case 29:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        z11 = true;
                    }
                    ((C1B78) this).LJJIIZ(z11);
                    return true;
                case 30:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (((C1B78) this).LLILLJJLI != null) {
                        Context context = C2199681B7e.LIZ;
                        synchronized (C2199681B7e.class) {
                            r3 = C2199681B7e.LJJIZ;
                        }
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(r3);
                    return true;
                case 31:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    List<DownloadInfo> unCompletedDownloadInfosWithMimeType = ((C1B78) this).getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                    return true;
                case 32:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).setLogLevel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zIsDownloadCacheSyncSuccess = ((C1B78) this).isDownloadCacheSyncSuccess();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDownloadCacheSyncSuccess ? 1 : 0);
                    return true;
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int i17 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    }
                    ((C1B78) this).LJJLIIIJLJLI(i17, z7);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    int iLJJLIIIJL = ((C1B78) this).LJJLIIIJL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iLJJLIIIJL);
                    return true;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (parcel.readInt() != 0) {
                        downloadInfoCreateFromParcel2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                    }
                    boolean zUpdateDownloadInfo = ((C1B78) this).updateDownloadInfo(downloadInfoCreateFromParcel2);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateDownloadInfo ? 1 : 0);
                    return true;
                case 37:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zLJIILLIIL = ((C1B78) this).LJIILLIIL(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJIILLIIL ? 1 : 0);
                    return true;
                case 38:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zLJIIIIZZ = ((C1B78) this).LJIIIIZZ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJIIIIZZ ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).clearData();
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).LJIIIZ(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    final IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                        if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC2199541B6q)) {
                            interfaceC2199541B6q = (InterfaceC2199541B6q) iInterfaceQueryLocalInterface2;
                        } else {
                            interfaceC2199541B6q = new InterfaceC2199541B6q(strongBinder2) { // from class: X.1B6o
                                public final IBinder LL;

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = strongBinder2;
                                }

                                @Override // X.InterfaceC2199541B6q
                                public final void LJJLIIIJJIZ(int i18, int i19) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                                        parcelObtain.writeInt(i18);
                                        parcelObtain.writeInt(i19);
                                        this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }
                            };
                        }
                    }
                    ((C1B78) this).LLLLLLLLL(interfaceC2199541B6q);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).LJJJJJ(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    C1B5O downloadNotificationEventListener = ((C1B78) this).getDownloadNotificationEventListener(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadNotificationEventListener != null) {
                        c1b5m = (C1B5M) downloadNotificationEventListener;
                    }
                    parcel2.writeStrongBinder(c1b5m);
                    return true;
                case 44:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    C1B6B notificationClickCallback = ((C1B78) this).getNotificationClickCallback(parcel.readInt());
                    parcel2.writeNoException();
                    if (notificationClickCallback != null) {
                        c1b69 = (C1B69) notificationClickCallback;
                    }
                    parcel2.writeStrongBinder(c1b69);
                    return true;
                case 45:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).f(parcel.readInt(), C1B5M.LJJJZ(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    InterfaceC19860412nC downloadFileUriProvider = ((C1B78) this).getDownloadFileUriProvider(parcel.readInt());
                    parcel2.writeNoException();
                    if (downloadFileUriProvider != null) {
                        abstractBinderC19860312nB = (AbstractBinderC19860312nB) downloadFileUriProvider;
                    }
                    parcel2.writeStrongBinder(abstractBinderC19860312nB);
                    return true;
                case 47:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean zLJJIJIL = ((C1B78) this).LJJIJIL();
                    parcel2.writeNoException();
                    parcel2.writeInt(zLJJIJIL ? 1 : 0);
                    return true;
                case 48:
                    parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    ((C1B78) this).setThrottleNetSpeed(parcel.readInt(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        return true;
    }
}
