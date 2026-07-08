package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0OL3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$startDownload$1", f = "BulletinProfileViewModel.kt", l = {842}, m = "invokeSuspend")
public final class C0OL3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OL3(BulletinProfileViewModel bulletinProfileViewModel, long j, boolean z, String str, InterfaceC1364105Vn<? super C0OL3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OL3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        String str;
        String absolutePath;
        int i;
        Boolean boolLIZIZ;
        C1C7U.LIZ("BulletinProfileViewModel@3b06.startDownload$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(377));
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            String strValueOf = String.valueOf(this.LLILLL);
            this.LL = 1;
            obj = c0oiu.LLJIJIL(strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDownload$1");
                return objLJFF;
            }
        }
        BulletinSettingList bulletinSettingList = (BulletinSettingList) obj;
        if (bulletinSettingList != null && (boolLIZIZ = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO)) != null) {
            zBooleanValue = boolLIZIZ.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLILLJJLI.LLJJL.LIZJ(bulletinSettingList);
        BulletinProfileViewModel bulletinProfileViewModel = this.LLILLJJLI;
        bulletinProfileViewModel.LLJJIJIIJIL = Boolean.valueOf(zBooleanValue);
        bulletinProfileViewModel.setState(new AwS24S0010000_9(zBooleanValue, 20));
        if (!zBooleanValue) {
            if (this.LLILZ) {
                i = 2131828135;
            } else {
                i = 2131828136;
            }
            this.LLILLJJLI.setState(new AwS24S0001000_9(i, 5));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDownload$1");
            return unit;
        }
        String str2 = this.LLILZIL;
        final boolean z = this.LLILZ;
        C0OL5 c0ol5 = this.LLILLJJLI.LLJLLIL;
        if (str2.length() != 0) {
            if (z) {
                str = "webp";
            } else {
                str = "mp4";
            }
            final Application application = C0CHQ.LIZ;
            if (application != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C2084808Es.LIZ(str2));
                sbLIZ.append(System.currentTimeMillis());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append('.');
                sbLIZ2.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                File fileLJIIIZ = C2354709Kn.LJIIIZ(application);
                if (fileLJIIIZ != null && (absolutePath = fileLJIIIZ.getAbsolutePath()) != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(absolutePath);
                    sbLIZ3.append('/');
                    sbLIZ3.append(strLIZIZ2);
                    final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    if (!new C0VSJ(strLIZIZ3).exists()) {
                        final WeakReference weakReference = new WeakReference(c0ol5);
                        DownloadTask downloadTaskWith = C2200151B8z.with(application);
                        downloadTaskWith.url(str2);
                        downloadTaskWith.minProgressTimeMsInterval(10);
                        downloadTaskWith.savePath(absolutePath);
                        downloadTaskWith.name(strLIZIZ2);
                        downloadTaskWith.retryCount(3);
                        downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.09NC
                            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onStart(DownloadInfo downloadInfo) {
                                C0OPX.LJIIIIZZ("startDownload mainThreadListener onStart");
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onSuccessed(DownloadInfo downloadInfo) throws Throwable {
                                String mimeType;
                                Uri contentUri;
                                Uri uriLJJIJLIJ;
                                Uri contentUri2;
                                C0OPX.LJIIIIZZ("startDownload mainThreadListener onSuccessed");
                                IDownloadListener iDownloadListener = weakReference.get();
                                if (iDownloadListener != null) {
                                    iDownloadListener.onSuccessed(downloadInfo);
                                }
                                C08N0 c08n0 = C08N0.LIZ;
                                Application application2 = application;
                                String str3 = strLIZIZ3;
                                boolean z2 = z;
                                if (downloadInfo != null) {
                                    mimeType = downloadInfo.getMimeType();
                                } else {
                                    mimeType = null;
                                }
                                c08n0.getClass();
                                C0VSJ c0vsj = new C0VSJ(str3);
                                if (z2) {
                                    String name = c0vsj.getName();
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(C786410Ut5.W3().getPath());
                                    sbLIZ4.append('/');
                                    sbLIZ4.append(Environment.DIRECTORY_DCIM);
                                    sbLIZ4.append("/Camera");
                                    C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
                                    if (!c0vsj2.exists()) {
                                        c0vsj2.mkdirs();
                                    }
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(Environment.DIRECTORY_DCIM);
                                    sbLIZ5.append("/Camera/");
                                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                                    if (application2 != null && name != null && name.length() != 0 && strLIZIZ4 != null && strLIZIZ4.length() != 0) {
                                        if (!u.LJIIZILJ(strLIZIZ4, "/", false)) {
                                            strLIZIZ4 = strLIZIZ4.concat("/");
                                        }
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("_display_name", name);
                                        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("mime_type", mimeType);
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            contentUri2 = MediaStore.Images.Media.getContentUri("external_primary");
                                            contentValues.put("relative_path", strLIZIZ4);
                                        } else {
                                            contentUri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                            contentValues.put("_data", C08N0.LIZJ(C786410Ut5.W3().getPath() + '/' + strLIZIZ4 + '/' + name));
                                        }
                                        uriLJJIJLIJ = C2204961BRm.LJJIJLIJ(application2.getContentResolver(), contentUri2, contentValues, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1k/Ne6UW04IjNZvl4seofPiUHtBYHch7zHDXmmIqPQzuJtvng7Q=", null));
                                    } else {
                                        return;
                                    }
                                } else {
                                    String name2 = c0vsj.getName();
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(C786410Ut5.W3().getPath());
                                    sbLIZ6.append('/');
                                    sbLIZ6.append(Environment.DIRECTORY_DCIM);
                                    sbLIZ6.append("/Camera");
                                    C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ6));
                                    if (!c0vsj3.exists()) {
                                        c0vsj3.mkdirs();
                                    }
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(Environment.DIRECTORY_DCIM);
                                    sbLIZ7.append("/Camera/");
                                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ7);
                                    if (application2 != null && name2 != null && name2.length() != 0 && strLIZIZ5 != null && strLIZIZ5.length() != 0) {
                                        if (!u.LJIIZILJ(strLIZIZ5, "/", false)) {
                                            strLIZIZ5 = strLIZIZ5.concat("/");
                                        }
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("_display_name", name2);
                                        contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                                        contentValues2.put("mime_type", "video/mp4");
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                                            contentValues2.put("relative_path", strLIZIZ5);
                                        } else {
                                            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                            contentValues2.put("_data", C08N0.LIZJ(C786410Ut5.W3().getPath() + '/' + strLIZIZ5 + '/' + name2));
                                        }
                                        uriLJJIJLIJ = C2204961BRm.LJJIJLIJ(application2.getContentResolver(), contentUri, contentValues2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1k/Ne6UW04IjNZvl4seofPiUHtBYHch7zHDXmmIqPQzuJtvng7Q=", null));
                                    } else {
                                        return;
                                    }
                                }
                                if (uriLJJIJLIJ != null) {
                                    try {
                                        C08N0.LIZIZ(new C0VSP(str3), C09NT.LJFF(application2.getContentResolver(), uriLJJIJLIJ));
                                        if (!TextUtils.isEmpty(str3)) {
                                            try {
                                                if (Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
                                                    C0VSJ c0vsj4 = new C0VSJ(str3);
                                                    if (c0vsj4.exists()) {
                                                        c0vsj4.delete();
                                                    }
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        if (application2 == null) {
                                            return;
                                        }
                                    }
                                    try {
                                        AssetFileDescriptor assetFileDescriptorLIZIZ = C09NT.LIZIZ(application2.getContentResolver(), uriLJJIJLIJ, "r");
                                        if (assetFileDescriptorLIZIZ != null) {
                                            try {
                                                assetFileDescriptorLIZIZ.close();
                                            } catch (IOException e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                            }
                                            C2204961BRm.LJJJJI(application2, new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriLJJIJLIJ), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1k/Ne6UW04IjNZvl4seofPiUHtBYHch7zHDXmmIqPQzuJtvng7Q=", null));
                                        }
                                    } catch (FileNotFoundException e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                }
                            }

                            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                String mimeType;
                                String str3;
                                C0OPX.LJIIIIZZ("startDownload mainThreadListener onFailed");
                                if (downloadInfo != null && (((mimeType = downloadInfo.getMimeType()) == null || mimeType.length() == 0) && downloadInfo != null)) {
                                    if (z) {
                                        str3 = "image/webp";
                                    } else {
                                        str3 = "video/mp4";
                                    }
                                    downloadInfo.setMimeType(str3);
                                }
                                IDownloadListener iDownloadListener = weakReference.get();
                                if (iDownloadListener != null) {
                                    iDownloadListener.onFailed(downloadInfo, baseException);
                                }
                            }
                        });
                        downloadTaskWith.asyncDownload(new InterfaceC2329409Au() { // from class: X.0OL4
                            @Override // X.InterfaceC2329409Au
                            public final void onStart(int i3) {
                            }
                        });
                    }
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.startDownload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
