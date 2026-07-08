package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nv7.c0;

/* JADX INFO: renamed from: X.120u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196870120u {
    public C196874120y LIZIZ;
    public final C196871120v LIZJ;
    public final C1351210lGZ LIZLLL;
    public final InterfaceC1452170ntP LJ;
    public final C1451390ns9 LJFF;
    public C121P LJI;
    public AnonymousClass1222 LJII;
    public StickerHintTextViewModel LJIIIIZZ;
    public final Context LJIIIZ;
    public C121E LJIILIIL;
    public final List<C196874120y> LIZ = new ArrayList();
    public boolean LJIIJ = true;
    public boolean LJIIJJI = false;
    public int LJIIL = c0.LIZ.n2();

    public final void LIZJ() {
        if (this.LIZIZ != null) {
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(this.LIZIZ.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                StickerItemModel stickerItemModel = this.LIZIZ.LLILLL;
                c348440DlKLJJIIJZLJL.LIZLLL = stickerItemModel.startTime;
                c348440DlKLJJIIJZLJL.LJ = stickerItemModel.endTime;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
            this.LIZIZ.LLILZIL = false;
            this.LIZIZ = null;
        }
    }

    public static boolean LJIILJJIL(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get("skip_info_sticker_apply_size")) == null) {
            return false;
        }
        String strTrim = str.trim();
        if (!"1".equals(strTrim) && !"true".equalsIgnoreCase(strTrim) && !"yes".equalsIgnoreCase(strTrim)) {
            return false;
        }
        return true;
    }

    public final boolean LJ(C196874120y c196874120y) {
        this.LJFF.getClass();
        if (c196874120y.LLILLL.isPin() && !C352130DrH.LIZIZ(this.LJ).LJIIIZ().LIZ().getInfoStickerVisible(c196874120y.LLILLL.uuid)) {
            return true;
        }
        return false;
    }

    public final void LJFF(C196874120y c196874120y) {
        if (c196874120y == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
        long duration = c348100DkmLIZIZ.LIZIZ.getPlayerApi().getDuration();
        c348100DkmLIZIZ.LJIIIZ().LJIILJJIL(c196874120y.LLILLL.uuid);
        if (duration != c348100DkmLIZIZ.LIZIZ.getPlayerApi().getDuration()) {
            atomicBoolean.set(true);
        }
        Function0<Unit> function0 = this.LJFF.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
        ((ArrayList) this.LIZ).remove(c196874120y);
        this.LIZIZ = null;
        C121P c121p = this.LJI;
        if (c121p != null) {
            c121p.LIZ(c196874120y.LLILLL, atomicBoolean.get());
        }
    }

    public final void LJIIIZ(C196874120y c196874120y) {
        if (c196874120y != null && !c196874120y.LLILLL.isNowSmallWindowSticker()) {
            StickerItemModel stickerItemModel = c196874120y.LLILLL;
            if (stickerItemModel.layerWeight == C364360EQg.LIZ) {
                C121E c121e = this.LJIILIIL;
                if (c121e != null) {
                    c121e.accept(c196874120y);
                    return;
                }
                return;
            }
            stickerItemModel.updateLayerWeight(C364360EQg.LIZ());
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null && !C351420Dq8.LIZLLL(c348100DkmLIZIZ.LIZ.getModel())) {
                c348440DlKLJJIIJZLJL.LIZJ = c196874120y.LLILLL.layerWeight;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
            C121E c121e2 = this.LJIILIIL;
            if (c121e2 == null) {
                return;
            }
            c121e2.accept(c196874120y);
        }
    }

    public final void LJIIJ(C196874120y c196874120y) {
        this.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348440DlKLJJIIJZLJL.LJIIIIZZ = 1.0f;
            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
        }
    }

    public final void LJIIJJI(C196874120y c196874120y) {
        if (c196874120y != null && ((ArrayList) this.LIZ).contains(c196874120y)) {
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                StickerItemModel stickerItemModel = c196874120y.LLILLL;
                c348440DlKLJJIIJZLJL.LIZLLL = stickerItemModel.startTime;
                c348440DlKLJJIIJZLJL.LJ = stickerItemModel.endTime;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
        }
    }

    public final void LJIIL(EnumC390580FTc enumC390580FTc) {
        for (C196874120y c196874120y : (ArrayList) this.LIZ) {
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                c348440DlKLJJIIJZLJL.LJIIIZ = enumC390580FTc.ordinal();
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
        }
    }

    public final void LJIILIIL(C196874120y c196874120y) {
        if (c196874120y != null) {
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                c348440DlKLJJIIJZLJL.LIZLLL = 0L;
                c348440DlKLJJIIJZLJL.LJ = this.LJ.getDuration();
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
        }
    }

    public final void LJIILL(List<StickerItemModel> list) {
        int i;
        if (C0IKQ.LIZ(list)) {
            return;
        }
        for (StickerItemModel stickerItemModel : list) {
            if (stickerItemModel.type != 1000 && (i = stickerItemModel.layerWeight) != C364360EQg.LIZIZ) {
                C364360EQg.LIZ = Math.max(i, C364360EQg.LIZ);
            }
            if (C1403820mdQ.LIZ(stickerItemModel)) {
                C196874120y c196874120y = new C196874120y(this.LIZJ.getContext(), stickerItemModel, this);
                C196871120v c196871120v = this.LIZJ;
                c196874120y.LJII(0.5f, 0.5f, c196871120v.LLILLL, c196871120v.LLILZ, c196871120v.LL, c196871120v.LLILLJJLI);
                c196874120y.LJIIIZ(stickerItemModel.scale);
                float f = stickerItemModel.currentOffsetX - 0.5f;
                C196871120v c196871120v2 = this.LIZJ;
                c196874120y.LJIIIIZZ(f * c196871120v2.LLILLL, (stickerItemModel.currentOffsetY - 0.5f) * c196871120v2.LLILZ);
                ((ArrayList) this.LIZ).add(c196874120y);
                if (stickerItemModel.isImageSticker()) {
                    c196874120y.LLJILJILJ = true;
                }
            }
        }
    }

    public final void LIZ(InfoStickerModel infoStickerModel, boolean z) {
        C348100Dkm c348100DkmLIZIZ;
        String str;
        int i;
        if (infoStickerModel != null && !C0IKQ.LIZ(infoStickerModel.stickers)) {
            ArrayList<StickerItemModel> arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel.type != 1000 && (i = stickerItemModel.layerWeight) != C364360EQg.LIZIZ) {
                    C364360EQg.LIZ = Math.max(i, C364360EQg.LIZ);
                }
                if (C1403820mdQ.LIZ(stickerItemModel)) {
                    if (z) {
                        this.LJFF.getClass();
                        if (stickerItemModel.isPin()) {
                            this.LJ.setInfoStickerRestoreMode(1);
                        }
                        if (TextUtils.isEmpty(stickerItemModel.uuid)) {
                            String str2 = infoStickerModel.infoStickerDraftDir;
                            this.LJFF.getClass();
                            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(this.LJ);
                            if (stickerItemModel.isImageSticker()) {
                                C348450DlL c348450DlL = new C348450DlL();
                                c348450DlL.LJIIL = stickerItemModel.path;
                                c348450DlL.LJFF = stickerItemModel.x;
                                c348450DlL.LJI = stickerItemModel.y;
                                c348450DlL.LJIILIIL = stickerItemModel.w;
                                c348450DlL.LJIILJJIL = stickerItemModel.h;
                                if (stickerItemModel.isPin() && C2286708xd.LIZJ(stickerItemModel.pinAlgorithmFile)) {
                                    this.LJ.setInfoStickerRestoreMode(1);
                                    c348450DlL.LJIILLIIL = stickerItemModel.pinAlgorithmFile;
                                    c348450DlL.LJIIZILJ = stickerItemModel.pinAlgorithmMappingFile;
                                } else {
                                    c348450DlL.LJII = -stickerItemModel.rotateAngle;
                                    c348450DlL.LJIIJ = stickerItemModel.scale;
                                    c348450DlL.LJFF = stickerItemModel.currentOffsetX;
                                    c348450DlL.LJI = stickerItemModel.currentOffsetY;
                                }
                                c348450DlL.LIZLLL = stickerItemModel.startTime;
                                c348450DlL.LJ = stickerItemModel.endTime;
                                c348450DlL.LIZJ = stickerItemModel.layerWeight;
                                stickerItemModel.uuid = c348100DkmLIZIZ2.LJIIIZ().LJJJJI(c348450DlL);
                            } else {
                                String strLIZIZ = stickerItemModel.path;
                                if (!C2286708xd.LIZJ(strLIZIZ)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str2);
                                    sbLIZ.append(new C0VSJ(strLIZIZ).getName());
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                                if (!C2286708xd.LIZJ(strLIZIZ)) {
                                    C2219091BtD.LIZLLL().LIZIZ(new Exception("infoSticker not exist in edit"));
                                } else {
                                    C348460DlM c348460DlM = new C348460DlM();
                                    c348460DlM.LJIIL = strLIZIZ;
                                    String[] strArr = new String[1];
                                    if (TextUtils.isEmpty(stickerItemModel.extra)) {
                                        str = "";
                                    } else {
                                        str = stickerItemModel.extra;
                                    }
                                    strArr[0] = str;
                                    c348460DlM.LJIILJJIL = strArr;
                                    if (!stickerItemModel.isPin() || !C2286708xd.LIZJ(stickerItemModel.pinAlgorithmFile)) {
                                        c348460DlM.LJII = -stickerItemModel.rotateAngle;
                                        c348460DlM.LJIIJ = stickerItemModel.scale;
                                        c348460DlM.LJFF = stickerItemModel.currentOffsetX;
                                        c348460DlM.LJI = stickerItemModel.currentOffsetY;
                                    }
                                    stickerItemModel.uuid = c348100DkmLIZIZ2.LJIIIZ().LJIIL(c348460DlM);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("veAddInfoSticker uuid = ");
                                    sbLIZ2.append(stickerItemModel.uuid);
                                    C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                                    if (TextUtils.isEmpty(stickerItemModel.uuid)) {
                                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("restore infoSticker failed: ");
                                        sbLIZ3.append(stickerItemModel.getId());
                                        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ3));
                                        C543670LTx c543670LTx = new C543670LTx();
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("restore_failed: ");
                                        sbLIZ4.append(stickerItemModel.getId());
                                        c543670LTx.LIZ.put("event", C2188811AlT.LIZIZ(sbLIZ4));
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("path: ");
                                        sbLIZ5.append(strLIZIZ);
                                        sbLIZ5.append(" extra: ");
                                        sbLIZ5.append(stickerItemModel.extra);
                                        c543670LTx.LIZ.put("user_info", C2188811AlT.LIZIZ(sbLIZ5));
                                        C1637890six.LIZIZ("info_sticker", c543670LTx.LJ());
                                    } else {
                                        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ2.LJIIIZ().LJJIIJZLJL(stickerItemModel.uuid);
                                        if (stickerItemModel.isPin() && C2286708xd.LIZJ(stickerItemModel.pinAlgorithmFile)) {
                                            this.LJ.setInfoStickerRestoreMode(1);
                                            if (c348440DlKLJJIIJZLJL instanceof C348460DlM) {
                                                C348460DlM c348460DlM2 = (C348460DlM) c348440DlKLJJIIJZLJL;
                                                c348460DlM2.LJIJ = stickerItemModel.pinAlgorithmFile;
                                                c348460DlM2.LJIJI = stickerItemModel.pinAlgorithmMappingFile;
                                            } else if (c348440DlKLJJIIJZLJL instanceof C348450DlL) {
                                                C348450DlL c348450DlL2 = (C348450DlL) c348440DlKLJJIIJZLJL;
                                                c348450DlL2.LJIILLIIL = stickerItemModel.pinAlgorithmFile;
                                                c348450DlL2.LJIIZILJ = stickerItemModel.pinAlgorithmMappingFile;
                                            }
                                            if (c348440DlKLJJIIJZLJL != null) {
                                                c348440DlKLJJIIJZLJL.LIZLLL = stickerItemModel.startTime;
                                                c348440DlKLJJIIJZLJL.LJ = stickerItemModel.endTime;
                                                c348440DlKLJJIIJZLJL.LIZJ = stickerItemModel.layerWeight;
                                                c348100DkmLIZIZ2.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                                            }
                                        } else if (c348440DlKLJJIIJZLJL != null) {
                                            c348440DlKLJJIIJZLJL.LJII = -stickerItemModel.rotateAngle;
                                            c348440DlKLJJIIJZLJL.LJIIJ = stickerItemModel.scale;
                                            c348440DlKLJJIIJZLJL.LJFF = stickerItemModel.currentOffsetX;
                                            c348440DlKLJJIIJZLJL.LJI = stickerItemModel.currentOffsetY;
                                            c348440DlKLJJIIJZLJL.LIZLLL = stickerItemModel.startTime;
                                            c348440DlKLJJIIJZLJL.LJ = stickerItemModel.endTime;
                                            c348440DlKLJJIIJZLJL.LIZJ = stickerItemModel.layerWeight;
                                            c348100DkmLIZIZ2.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                                        }
                                    }
                                }
                                arrayList.add(stickerItemModel);
                            }
                        }
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LJ;
                    if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null) {
                        float[] fArrLIZJ = c348100DkmLIZIZ.LJIIIZ().LIZ().LIZJ(stickerItemModel.uuid);
                        float f = fArrLIZJ[2] - fArrLIZJ[0];
                        C196871120v c196871120v = this.LIZJ;
                        stickerItemModel.initWidth = f * c196871120v.LLILLL;
                        stickerItemModel.initHeight = (fArrLIZJ[1] - fArrLIZJ[3]) * c196871120v.LLILZ;
                    }
                    C196874120y c196874120y = new C196874120y(this.LIZJ.getContext(), stickerItemModel, this);
                    C196871120v c196871120v2 = this.LIZJ;
                    int i2 = c196871120v2.LLILLL;
                    int i3 = c196871120v2.LLILZ;
                    int i4 = c196871120v2.LL;
                    int i5 = c196871120v2.LLILLJJLI;
                    float f2 = stickerItemModel.scale;
                    c196874120y.LJII(0.5f, 0.5f, i2, i3, i4, i5);
                    c196874120y.LLJILJIL = f2;
                    float f3 = stickerItemModel.currentOffsetX - 0.5f;
                    C196871120v c196871120v3 = this.LIZJ;
                    c196874120y.LJIIIIZZ(f3 * c196871120v3.LLILLL, (stickerItemModel.currentOffsetY - 0.5f) * c196871120v3.LLILZ);
                    ((ArrayList) this.LIZ).add(c196874120y);
                    if (stickerItemModel.isImageSticker()) {
                        c196874120y.LLJILJILJ = true;
                    }
                }
            }
            if (C0IKQ.LIZIZ(arrayList)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("restore info stickers error: ");
                sbLIZ6.append(arrayList.size());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ6));
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("remove error sticker ");
                    sbLIZ7.append(stickerItemModel2.getId());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ7));
                    infoStickerModel.removeSticker(stickerItemModel2);
                }
            }
        }
    }

    public final void LIZIZ(String str, C196874120y c196874120y) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        if (C0CH8.LIZ() && (interfaceC1452170ntP = this.LJ) != null && C352130DrH.LIZIZ(interfaceC1452170ntP) != null) {
            C0FW6 c0fw6LJIIIZ = C352130DrH.LIZIZ(this.LJ).LJIIIZ();
            RectF rectF = c196874120y.LLJ;
            Context context = this.LIZJ.getContext();
            float screenWidth = ((ScreenUtils.getScreenWidth(context) - C11VU.LIZIZ(6.0f, context)) / 3.0f) - (-C11VU.LIZIZ(20.0f, context));
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (fWidth > screenWidth || fHeight > screenWidth) {
                float fMin = Math.min(screenWidth / fWidth, screenWidth / fHeight);
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                c0fw6LJIIIZ.LJJIL(arrayList, fMin);
                c196874120y.LLILLL.scale = fMin;
                c196874120y.LJIIIZ(fMin);
            }
        }
    }

    public final void LJII(C196874120y c196874120y, float f) {
        if (f == 0.0f || c196874120y.LLILLL.isNowSmallWindowSticker()) {
            return;
        }
        c196874120y.LLILLL.rotateAngle += f;
        this.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348440DlKLJJIIJZLJL.LJII = -c196874120y.LLILLL.rotateAngle;
            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
        }
        Function0<Unit> function0 = this.LJFF.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
        RectF rectF = c196874120y.LLIZLLLIL;
        if (rectF != null) {
            c196874120y.LLJI.postRotate(f, rectF.centerX(), c196874120y.LLIZLLLIL.centerY());
        }
    }

    public final void LJIIIIZZ(C196874120y c196874120y, float f) {
        if (c196874120y.LLILLL.isMusicShareToStorySticker()) {
            if (f >= 0.8f && f <= 1.6f) {
                LJIILLIIL(c196874120y, f, 0.8f, 1.6f);
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.LIZLLL.LIZ();
                return;
            } else {
                this.LIZLLL.LIZIZ(85, 61);
                return;
            }
        }
        if (c196874120y.LLILLL.isMagnifier()) {
            LJIILLIIL(c196874120y, f, c196874120y.LL, c196874120y.LLILLJJLI);
        } else {
            LJIILLIIL(c196874120y, f, c196874120y.LL, 2.1474836E9f);
        }
    }

    public final void LJI(C196874120y c196874120y, float f, float f2) {
        StickerItemModel stickerItemModel = c196874120y.LLILLL;
        float f3 = stickerItemModel.currentOffsetX;
        C196871120v c196871120v = this.LIZJ;
        stickerItemModel.currentOffsetX = f3 + (f / c196871120v.LLILLL);
        stickerItemModel.currentOffsetY += f2 / c196871120v.LLILZ;
        this.LJFF.getClass();
        C0FW6 c0fw6LJIIIZ = C352130DrH.LIZIZ(this.LJ).LJIIIZ();
        StickerItemModel stickerItemModel2 = c196874120y.LLILLL;
        c0fw6LJIIIZ.LJFF(Float.valueOf(stickerItemModel2.currentOffsetX), Float.valueOf(c196874120y.LLILLL.currentOffsetY), stickerItemModel2.uuid);
        Function0<Unit> function0 = this.LJFF.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
        c196874120y.LJIIIIZZ(f, f2);
    }

    public final void LJIIZILJ(C196874120y c196874120y, int i, int i2) {
        if (c196874120y != null) {
            StickerItemModel stickerItemModel = c196874120y.LLILLL;
            stickerItemModel.startTime = i;
            stickerItemModel.endTime = i2;
            stickerItemModel.uiStartTime = i;
            stickerItemModel.uiEndTime = i2;
            this.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                c348440DlKLJJIIJZLJL.LIZLLL = i;
                c348440DlKLJJIIJZLJL.LJ = i2;
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
        }
    }

    public C196870120u(Context context, C196871120v c196871120v, InterfaceC1452170ntP interfaceC1452170ntP, View view) {
        this.LIZJ = c196871120v;
        this.LJ = interfaceC1452170ntP;
        this.LJIIIZ = context;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.getDuration();
        }
        this.LIZLLL = new C1351210lGZ(c196871120v.getContext());
        this.LJFF = new C1451390ns9(interfaceC1452170ntP);
        this.LJIIIIZZ = (StickerHintTextViewModel) C1659630tI1.LIZLLL(view).get(StickerHintTextViewModel.class);
    }

    public final void LJIILLIIL(C196874120y c196874120y, float f, float f2, float f3) {
        StickerItemModel stickerItemModel = c196874120y.LLILLL;
        float f4 = stickerItemModel.scale * f;
        if (f4 < f2 && f < 1.0f) {
            return;
        }
        if ((f4 > f3 && f > 1.0f) || stickerItemModel.isNowSmallWindowSticker()) {
            return;
        }
        this.LJFF.getClass();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LJ);
        C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196874120y.LLILLL.uuid);
        if (c348440DlKLJJIIJZLJL != null) {
            c348440DlKLJJIIJZLJL.LJIIJ *= f;
            c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
        }
        c196874120y.LLILLL.scale = f4;
        c196874120y.LJIIIZ(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C196874120y LIZLLL(java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, float r33, float r34, float r35, float r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196870120u.LIZLLL(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, float, float, float, float, boolean):X.120y");
    }
}
