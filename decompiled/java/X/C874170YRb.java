package X;

import Y.ARunnableS25S0101000_14;
import Y.ARunnableS83S0200000_14;
import com.bytedance.im.core.message.media.model.IMEncryptedImageContent;
import com.bytedance.im.core.message.media.model.IMEncryptedImageContentExtra;
import com.bytedance.im.core.message.media.model.IMImageMetaInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;

/* JADX INFO: renamed from: X.0YRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874170YRb implements BDImageXUploaderListener {
    public final /* synthetic */ C874190YRd LIZ;

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    public C874170YRb(C874190YRd c874190YRd) {
        this.LIZ = c874190YRd;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        return this.LIZ.LLILLL.LIZ().LIZ.LJ().LIZ().LIZIZ() ? 1 : 0;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        String str;
        int i2;
        if (i != 1) {
            if (i != 6) {
                if (i == 7) {
                    if (this.LIZ.LLILLL.getConfig().LIZ().LJJLIIIIJ.LIZJ.LIZIZ && bDImageXInfo != null && bDImageXInfo.mErrorCode == 100028) {
                        C874190YRd c874190YRd = this.LIZ;
                        if (!c874190YRd.LLIZLLLIL) {
                            c874190YRd.LLIZLLLIL = true;
                            try {
                                InterfaceC497601wk interfaceC497601wkLIZ = c874190YRd.LLILLL.LLJLL().LIZ();
                                if (interfaceC497601wkLIZ != null) {
                                    C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C874180YRc(c874190YRd, bDImageXInfo, null), 3);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                String str2 = bDImageXInfo.mErrorMsg;
                                if (str2 == null) {
                                    str2 = "token is expired, retry fetch failed";
                                }
                                c874190YRd.LIZJ((int) bDImageXInfo.mErrorCode, new C874260YRk(str2));
                                return;
                            }
                        }
                    }
                    C874190YRd c874190YRd2 = this.LIZ;
                    if (bDImageXInfo == null || (str = bDImageXInfo.mErrorMsg) == null) {
                        str = "dm photo upload failed";
                    }
                    C874260YRk c874260YRk = new C874260YRk(str);
                    if (bDImageXInfo != null) {
                        i2 = (int) bDImageXInfo.mErrorCode;
                    } else {
                        i2 = 20006;
                    }
                    c874190YRd2.LIZJ(i2, c874260YRk);
                    return;
                }
                return;
            }
            if (bDImageXInfo == null) {
                this.LIZ.LIZJ(20005, new C874260YRk("Upload info is null"));
                return;
            }
            if (((C0YRY) this.LIZ.LL).LIZLLL == 1) {
                try {
                    C873920YQc c873920YQc = new C873920YQc((IMEncryptedImageContent) C09EF.LIZ.LJII(bDImageXInfo.mEncryptionMeta, IMEncryptedImageContent.class), 1);
                    C874190YRd c874190YRd3 = this.LIZ;
                    BDImageXUploader bDImageXUploader = c874190YRd3.LLILZLL;
                    if (bDImageXUploader != null) {
                        bDImageXUploader.close();
                    }
                    C787080UuA.LIZIZ(new ARunnableS83S0200000_14(c874190YRd3, c873920YQc, 2));
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
            try {
                IMImageMetaInfo iMImageMetaInfo = (IMImageMetaInfo) C09EF.LIZ.LJII(bDImageXInfo.mMetaInfo, IMImageMetaInfo.class);
                C874190YRd c874190YRd4 = this.LIZ;
                C873920YQc c873920YQc2 = new C873920YQc(new IMEncryptedImageContent(iMImageMetaInfo.imageUri, null, null, new IMEncryptedImageContentExtra(iMImageMetaInfo.width, iMImageMetaInfo.height, null)), 1);
                BDImageXUploader bDImageXUploader2 = c874190YRd4.LLILZLL;
                if (bDImageXUploader2 != null) {
                    bDImageXUploader2.close();
                }
                C787080UuA.LIZIZ(new ARunnableS83S0200000_14(c874190YRd4, c873920YQc2, 2));
                return;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return;
            }
        }
        C874190YRd c874190YRd5 = this.LIZ;
        c874190YRd5.getClass();
        C787080UuA.LIZIZ(new ARunnableS25S0101000_14((int) j, c874190YRd5, 0));
    }
}
