package X;

import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.AfS182S0100000_13;
import Y.AfS191S0100000_22;
import Y.AfS8S0200100_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS457S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428330nGx extends AbstractC1664490tPr<C1428440nH8, C1428380nH2> implements InterfaceC379610EuV, InterfaceC362610EJn, InterfaceC20660615sy {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final C1DRG LLJJJIL;
    public final InterfaceC1428340nGy LLJJJJ;
    public final C1424090nA7 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 156));
    public DialogC1390150mHN LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<AbstractC1427970nGN> LLJL;
    public final C1664750tQH LLJLIL;
    public final C1664740tQG LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public C11NJ LLJZIJLIL;
    public boolean LLL;
    public String LLLF;
    public C11NJ LLLFF;
    public long LLLFFI;
    public NLEModel LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1428330nGx.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1428330nGx.class, "publishModel", "getPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1428330nGx.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "PhotoTemplateScene";
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final C1430980nLE LLLLLLJ() {
        return (C1430980nLE) this.LLJLLL.getValue();
    }

    public final C1428050nGV LLLLLLL() {
        return (C1428050nGV) this.LLJLL.getValue();
    }

    public final InterfaceC1428350nGz LLLLLLLLL() {
        return (InterfaceC1428350nGz) this.LLJLLIL.getValue();
    }

    public final VideoPublishEditModel LLLLLLLLLL() {
        return (VideoPublishEditModel) this.LLJLIL.getValue(this, LLLIIII[1]);
    }

    public final InterfaceC1452170ntP LLLLLLLZIL() {
        return this.LLJJJJ.g();
    }

    public final void LLLLLLZ() {
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL;
        C385200F8k.LIZ("PhotoTemplateScene", "reset");
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL2 = LLLLLLLZIL();
        if (interfaceC1452170ntPLLLLLLLZIL2 != null) {
            C371780Ehs.LJIILLIIL(interfaceC1452170ntPLLLLLLLZIL2, LLLLLLJ().LIZJ);
        }
        if (this.LLJJJJ.mn() && (interfaceC1452170ntPLLLLLLLZIL = LLLLLLLZIL()) != null) {
            interfaceC1452170ntPLLLLLLLZIL.play();
        }
        this.LLJJJJ.ln(true, false);
    }

    public final boolean LLLLLLZZ() {
        EditImageInfo editImageInfo;
        if (this.LLJJJJ.mn()) {
            return false;
        }
        SingleImageData singleImageData = LLLLLLJ().LIZLLL;
        if (singleImageData == null || (editImageInfo = singleImageData.getEditImageInfo()) == null) {
            return true;
        }
        editImageInfo.getRatioMode();
        return true;
    }

    public final PhotoTemplateAsset LLLLLL() {
        PhotoTemplateAsset photoTemplateAssetLIZLLL = LLLLLLLLL().LIZLLL();
        if (photoTemplateAssetLIZLLL != null) {
            return photoTemplateAssetLIZLLL;
        }
        if (LLLLLLJ().LJFF) {
            return null;
        }
        return LLLLLLJ().LIZJ();
    }

    public final CategoryInfo LLLLLLIL() {
        return LLLLLLL().LJI.getCurrentTab();
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return isVisible();
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null) {
            return new C688120Qyw(contextLIZIZ, this, null);
        }
        return null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        DialogC1390150mHN dialogC1390150mHN = this.LLJJLIIIJLLLLLLLZ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        C11NJ c11nj = this.LLJZIJLIL;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLJZIJLIL = null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    public final void LLLLLJIL(C1427930nGJ c1427930nGJ) {
        final long j;
        NLEModel nLEModelDynamicCast;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        DialogC1390150mHN dialogC1390150mHN;
        Bitmap currDisplayImage;
        Float fValueOf;
        NLEModel nLEModelLIZ;
        Asset asset;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLLI = LLLLLLJ().LJFF;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_debug_tool", true, false) && C2272641DxO.LJII.length() > 0 && (asset = c1427930nGJ.LIZ.getAsset()) != null) {
            asset.setAsset_type(AssetType.PHOTO_BASELINE_SINGLE.getValue());
        }
        final PhotoTemplateAsset photoTemplateAsset = c1427930nGJ.LIZ;
        if (C1413020msG.LIZ(photoTemplateAsset, LLLLLLLLL().LIZLLL()) || (!LLLLLLJ().LJFF && C1413020msG.LIZ(photoTemplateAsset, LLLLLLJ().LIZJ()))) {
            C385200F8k.LIZ("PhotoTemplateScene", "applyTemplate: same asset");
            return;
        }
        if (this.LLJJJJ.gn() >= 35 && photoTemplateAsset.getGenerateNewImage() && !LLLLLLJ().LIZLLL()) {
            PopupManager.LJIJI(new C0TTK(this), true);
            return;
        }
        if (this.LLL && this.LLJJJJ.in()) {
            PopupManager.LJIJI(new C1910910zpJ(this, new AwS423S0200000_22(this, c1427930nGJ, 14)), true);
            return;
        }
        NLEModel nLEModelLJI = LLLLLLLLL().LJI(photoTemplateAsset);
        if (nLEModelLJI != null) {
            C385200F8k.LIZ("PhotoTemplateScene", "applyTemplate: fast apply");
            this.LLJJJJ.ln(false, false);
            InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL = LLLLLLLZIL();
            if (interfaceC1452170ntPLLLLLLLZIL != null) {
                C371780Ehs.LJIILLIIL(interfaceC1452170ntPLLLLLLLZIL, nLEModelLJI);
            }
            this.LLJL.setValue(new C1427960nGM(photoTemplateAsset, false));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "photo_template_remove_template_fix", true, true) || LLLLLLJ().LIZJ() != null) {
                LLLLLLJ().LJFF = true;
            }
            C1412270mr3 c1412270mr3 = C1412270mr3.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLLLLLLL = LLLLLLLLLL();
            EnumC1288170jct enumC1288170jct = EnumC1288170jct.SUCCESS;
            int value = EnumC358710E4n.SUCCESS.getValue();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            CategoryInfo categoryInfoLLLLLLIL = LLLLLLIL();
            c1412270mr3.getClass();
            C1412270mr3.LIZLLL(videoPublishEditModelLLLLLLLLLL, enumC1288170jct, value, "", jCurrentTimeMillis2, photoTemplateAsset, categoryInfoLLLLLLIL, true);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyTemplate ");
        sbLIZ.append(photoTemplateAsset);
        C385200F8k.LIZJ("PhotoTemplateScene", C2188811AlT.LIZIZ(sbLIZ));
        if (C0C0Q.LIZ()) {
            j = this.LLLFFI + 1;
            this.LLLFFI = j;
        } else {
            j = this.LLLFFI;
        }
        Bitmap bitmapLIZ = null;
        if (C0C0Q.LIZ()) {
            C11NJ c11nj = this.LLLFF;
            if (c11nj != null) {
                c11nj.dispose();
            }
            this.LLLFF = null;
            LLLLLLLLL().LIZJ();
            DialogC1390150mHN dialogC1390150mHN2 = this.LLJJLIIIJLLLLLLLZ;
            if (dialogC1390150mHN2 != null) {
                dialogC1390150mHN2.dismiss();
                C785410UrT.LIZ(dialogC1390150mHN2);
            }
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL2 = LLLLLLLZIL();
        if (interfaceC1452170ntPLLLLLLLZIL2 != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPLLLLLLLZIL2)) != null) {
            nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLIZ.deepClone());
        } else {
            nLEModelDynamicCast = null;
        }
        this.LLLFZ = nLEModelDynamicCast;
        NLEModel nLEModelLIZIZ = LLLLLLJ().LIZIZ();
        NLETrack mainTrack = nLEModelLIZIZ.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null) {
            Context contextLIZIZ = C545820Lau.LIZIZ(this);
            if (contextLIZIZ == null) {
                dialogC1390150mHN = null;
            } else {
                dialogC1390150mHN = new DialogC1390150mHN(contextLIZIZ);
                dialogC1390150mHN.LJJLJLI(contextLIZIZ.getString(2131829978));
                dialogC1390150mHN.LJJZ(true);
                dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0nGw
                    @Override // X.InterfaceC1389630mGX
                    public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                        C1428330nGx c1428330nGx = this;
                        c1428330nGx.LLJJLIIIJLLLLLLLZ = null;
                        C11NJ c11nj2 = c1428330nGx.LLLFF;
                        if (c11nj2 != null) {
                            c11nj2.dispose();
                        }
                        C1428330nGx c1428330nGx2 = this;
                        c1428330nGx2.LLLFF = null;
                        c1428330nGx2.LLLLLLLLL().LIZJ();
                        InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL3 = this.LLLLLLLZIL();
                        if (interfaceC1452170ntPLLLLLLLZIL3 != null) {
                            C371780Ehs.LJIILLIIL(interfaceC1452170ntPLLLLLLLZIL3, this.LLLFZ);
                        }
                        this.LLJJJJ.ln(true, true);
                        C1430980nLE c1430980nLELLLLLLJ = this.LLLLLLJ();
                        C1428330nGx c1428330nGx3 = this;
                        c1430980nLELLLLLLJ.LJFF = c1428330nGx3.LLLI;
                        C1412270mr3 c1412270mr32 = C1412270mr3.LIZ;
                        VideoPublishEditModel videoPublishEditModelLLLLLLLLLL2 = c1428330nGx3.LLLLLLLLLL();
                        EnumC1288170jct enumC1288170jct2 = EnumC1288170jct.CANCEL;
                        int value2 = EnumC358710E4n.OTHERS.getValue();
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                        PhotoTemplateAsset photoTemplateAsset2 = photoTemplateAsset;
                        CategoryInfo categoryInfoLLLLLLIL2 = this.LLLLLLIL();
                        c1412270mr32.getClass();
                        C1412270mr3.LIZLLL(videoPublishEditModelLLLLLLLLLL2, enumC1288170jct2, value2, "cancel", jCurrentTimeMillis3, photoTemplateAsset2, categoryInfoLLLLLLIL2, false);
                    }
                };
            }
            this.LLJJLIIIJLLLLLLLZ = dialogC1390150mHN;
            if (dialogC1390150mHN != null) {
                dialogC1390150mHN.LJJLL(0.0f, false);
            }
            LifecycleOwnerExtensionsKt.LIZIZ(this, 500L, new ARunnableS122S0100000_22(this, 20));
            InterfaceC1452170ntP interfaceC1452170ntPLLLLLLLZIL3 = LLLLLLLZIL();
            if (interfaceC1452170ntPLLLLLLLZIL3 != null) {
                currDisplayImage = interfaceC1452170ntPLLLLLLLZIL3.getCurrDisplayImage(C1450870nrJ.LIZIZ);
            } else {
                currDisplayImage = null;
            }
            if (LLLLLLZZ()) {
                if (currDisplayImage != null) {
                    SingleImageData singleImageData = LLLLLLJ().LIZLLL;
                    if (singleImageData != null) {
                        fValueOf = Float.valueOf(singleImageData.getImageRatio());
                    } else {
                        fValueOf = null;
                    }
                    bitmapLIZ = C360120E9y.LIZ(currDisplayImage, fValueOf, null);
                }
                currDisplayImage = bitmapLIZ;
            }
            LLLLLLL().LIZIZ(currDisplayImage, true);
            this.LLLFF = new C11NJ();
            C371780Ehs.LIZ(this.LLLFF, LLLLLLLLL().LJ(c1427930nGJ.LIZIZ, photoTemplateAsset, nLETrackSlot, nLEModelLIZIZ, this, new AwS601S0100000_22(this, 116)).LJIILJJIL(new AfS191S0100000_22(this, 8)).LJJ(C1701940uOG.LIZIZ()).LJIIJ(new InterfaceC781210Ukh() { // from class: X.0nH0
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    if (!C0C0Q.LIZ() || j == this.LLLFFI) {
                        DialogC1390150mHN dialogC1390150mHN3 = this.LLJJLIIIJLLLLLLLZ;
                        if (dialogC1390150mHN3 != null) {
                            dialogC1390150mHN3.dismiss();
                            C785410UrT.LIZ(dialogC1390150mHN3);
                        }
                        C1428330nGx c1428330nGx = this;
                        c1428330nGx.LLJJLIIIJLLLLLLLZ = null;
                        c1428330nGx.LLLLLLL().LIZIZ(null, false);
                    }
                }
            }).LJJIIZ(new AfS8S0200100_22(jCurrentTimeMillis, photoTemplateAsset, this, 0), new AfS8S0200100_22(jCurrentTimeMillis, photoTemplateAsset, this, 1)));
        }
    }

    public final void LLLLLZ(Function0 function0, boolean z) {
        NLEModel nLEModelLIZ;
        SrcImageInfo srcImageInfo;
        PhotoTemplateAsset photoTemplateAsset;
        CategoryInfo photoTemplateTab;
        SrcImageInfo srcImageInfo2;
        PhotoTemplateInfo photoTemplateInfo;
        C19A3 c19a3;
        View view;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_debug_tool", true, false) && (view = ((C2272641DxO) this.LLLII.getValue()).LIZ) != null) {
            C1428310nGv.LJIIIIZZ(view, z);
        }
        if (!z) {
            SingleImageData singleImageData = LLLLLLJ().LIZLLL;
            if (singleImageData != null) {
                C385200F8k.LIZJ("PhotoTemplateScene", "hidePanel");
                LLLLLLL().LIZ(false, singleImageData, new AwS457S0200000_22(function0, (Function0<Unit>) this, (C1428330nGx) 0));
                C11NJ c11nj = this.LLJZIJLIL;
                if (c11nj != null) {
                    c11nj.dispose();
                }
                this.LLJZIJLIL = null;
                C11NJ c11nj2 = this.LLLFF;
                if (c11nj2 != null) {
                    c11nj2.dispose();
                }
                this.LLLFF = null;
                DialogC1390150mHN dialogC1390150mHN = this.LLJJLIIIJLLLLLLLZ;
                if (dialogC1390150mHN != null) {
                    dialogC1390150mHN.dismiss();
                    C785410UrT.LIZ(dialogC1390150mHN);
                }
                this.LLJJLIIIJLLLLLLLZ = null;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        this.LLJZIJLIL = new C11NJ();
        this.LLL = this.LLJJJJ.in();
        this.LLLFZ = null;
        this.LLLF = null;
        C1430980nLE c1430980nLELLLLLLJ = LLLLLLJ();
        c1430980nLELLLLLLJ.LIZLLL = c1430980nLELLLLLLJ.LIZIZ.LJIL();
        InterfaceC1452170ntP interfaceC1452170ntPG = c1430980nLELLLLLLJ.LIZIZ.g();
        if (interfaceC1452170ntPG != null) {
            nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPG);
        } else {
            nLEModelLIZ = null;
        }
        c1430980nLELLLLLLJ.LIZJ = nLEModelLIZ;
        SingleImageData singleImageData2 = c1430980nLELLLLLLJ.LIZLLL;
        if (singleImageData2 != null) {
            PhotoTemplateInfo photoTemplateInfo2 = singleImageData2.getPhotoTemplateInfo();
            if (photoTemplateInfo2 == null || (srcImageInfo = photoTemplateInfo2.getOriginalImage()) == null) {
                srcImageInfo = singleImageData2.getSrcImageInfo();
            }
            String path = srcImageInfo.getPath();
            int width = srcImageInfo.getWidth();
            int height = srcImageInfo.getHeight();
            EditImageInfo editImageInfo = singleImageData2.getEditImageInfo();
            PhotoTemplateInfo photoTemplateInfo3 = singleImageData2.getPhotoTemplateInfo();
            if (photoTemplateInfo3 != null) {
                photoTemplateAsset = photoTemplateInfo3.getPhotoTemplateAsset();
            } else {
                photoTemplateAsset = null;
            }
            PhotoTemplateInfo photoTemplateInfo4 = singleImageData2.getPhotoTemplateInfo();
            if (photoTemplateInfo4 != null) {
                photoTemplateTab = photoTemplateInfo4.getPhotoTemplateTab();
            } else {
                photoTemplateTab = null;
            }
            c1430980nLELLLLLLJ.LJ = c1430980nLELLLLLLJ.LIZ(path, width, height, singleImageData2, editImageInfo, photoTemplateAsset, photoTemplateTab, singleImageData2.getImageVideoSharedModel());
            c1430980nLELLLLLLJ.LJFF = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initSession: ");
            SingleImageData singleImageData3 = c1430980nLELLLLLLJ.LIZLLL;
            if (singleImageData3 != null) {
                srcImageInfo2 = singleImageData3.getSrcImageInfo();
            } else {
                srcImageInfo2 = null;
            }
            sbLIZ.append(srcImageInfo2);
            sbLIZ.append(",\n");
            SingleImageData singleImageData4 = c1430980nLELLLLLLJ.LIZLLL;
            if (singleImageData4 != null) {
                photoTemplateInfo = singleImageData4.getPhotoTemplateInfo();
            } else {
                photoTemplateInfo = null;
            }
            sbLIZ.append(photoTemplateInfo);
            C385200F8k.LIZJ("PhotoTemplateDataManager", C2188811AlT.LIZIZ(sbLIZ));
            SingleImageData singleImageData5 = LLLLLLJ().LIZLLL;
            if (singleImageData5 != null) {
                InterfaceC1428350nGz interfaceC1428350nGzLLLLLLLLL = LLLLLLLLL();
                SingleImageData singleImageData6 = LLLLLLJ().LJ;
                C371780Ehs.LIZLLL(singleImageData6);
                interfaceC1428350nGzLLLLLLLLL.LIZIZ(singleImageData6);
                C0LE8.LIZIZ(null);
                LLLLLLL().LIZIZ(null, false);
                LLLLLLL().LIZ(true, singleImageData5, new AwS457S0200000_22(function0, (Function0<Unit>) this, (C1428330nGx) 1));
                Scene scene = this.mParentScene;
                if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                    c19a3.show(this);
                }
                Object value = this.LLJZ.getValue();
                C371780Ehs.LIZLLL(LLLLLLJ().LJ);
                LLLLLLLLLL();
                value.getClass();
                C385200F8k.LIZ("PhotoTemplatePicUploader", "skip upload pic");
                C1239300iM4.LIZLLL(AbstractC19484711Kz.LJIJJLI("").LJIILL(new AfS182S0100000_13(this, 66)).LJJII(new InterfaceC1487280oo2() { // from class: X.0nGU
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        C385200F8k.LIZIZ("PhotoTemplateScene", "upload pic failed", (Throwable) obj);
                        return "";
                    }
                }).LJJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, new AwS601S0100000_22(this, 115));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !isVisible()) {
            return false;
        }
        LLLLLLZ();
        LLLLLZ(new AwS566S0100000_22(this, 161), false);
        return true;
    }

    public C1428330nGx(C1DRG c1drg, InterfaceC1428340nGy interfaceC1428340nGy, C1424090nA7 c1424090nA7) {
        this.LLJJJIL = c1drg;
        this.LLJJJJ = interfaceC1428340nGy;
        this.LLJJJJJIL = c1424090nA7;
        MutableLiveData<AbstractC1427970nGN> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, new AObserverS225S0100000_22(this, 25));
        this.LLJL = mutableLiveData;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC524950KiL.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC559500Lwy.class, null);
        this.LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 154));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 155));
        this.LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 153));
        this.LLJZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(87));
        this.LLL = true;
        this.LLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 157));
        ((InterfaceC524950KiL) c1664750tQHLIZ.getValue(this, LLLIIII[0])).kF(this);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqf, viewGroup, false);
    }

    public final void LLLLLJLJLL(final CategoryInfo categoryInfo, final boolean z, final boolean z2, final Function0<Unit> function0) {
        String category_name;
        final Pair pairLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPanel: tab=");
        if (categoryInfo != null) {
            category_name = categoryInfo.getCategory_name();
        } else {
            category_name = null;
        }
        sbLIZ.append(category_name);
        C385200F8k.LIZJ("PhotoTemplateScene", C2188811AlT.LIZIZ(sbLIZ));
        SingleImageData singleImageData = LLLLLLJ().LIZLLL;
        if (singleImageData != null) {
            final AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(singleImageData, this, 19);
            C1428050nGV c1428050nGVLLLLLLL = LLLLLLL();
            if (z && c1428050nGVLLLLLLL.LJI.LLILLJJLI.LLILZ.isEmpty()) {
                c1428050nGVLLLLLLL.LJI.setData(C13BV.INSTANCE);
            }
            c1428050nGVLLLLLLL.LJFF.setData(C13BV.INSTANCE);
            c1428050nGVLLLLLLL.LIZJ(false);
            if (this.LLJJJJ.mn()) {
                C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
                TemplateScene templateScene = TemplateScene.CANVAS_PHOTO_TEMPLATE;
                c1429050nI7.getClass();
                pairLIZJ = C1429050nI7.LIZJ(templateScene);
            } else {
                C1429050nI7 c1429050nI72 = C1429050nI7.LIZ;
                TemplateScene templateScene2 = TemplateScene.PHOTO_TEMPLATE;
                c1429050nI72.getClass();
                pairLIZJ = C1429050nI7.LIZJ(templateScene2);
            }
            this.LLJJJJJIL.LIZ = C568750MSj.LIZIZ(LLLLLLLLLL());
            if (categoryInfo == null) {
                C371780Ehs.LIZ(this.LLJZIJLIL, this.LLJJJJJIL.LIZJ(this.LLLF, pairLIZJ, z).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0nGS
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Integer numValueOf;
                        Asset asset;
                        C1C7U.LIZ("PhotoTemplateScene@59f2.fetchPanel$1");
                        AssetPanelModel assetPanelModel = (AssetPanelModel) obj;
                        C385200F8k.LIZJ("PhotoTemplateScene", "fetchPanel succeed");
                        C1428050nGV c1428050nGVLLLLLLL2 = this.LL.LLLLLLL();
                        c1428050nGVLLLLLLL2.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updatePanel category_list:");
                        sbLIZ2.append(assetPanelModel.category_list.size());
                        sbLIZ2.append(", asset_list:");
                        List<Asset> list = assetPanelModel.asset_list;
                        PhotoTemplateAsset photoTemplateAssetLIZLLL = null;
                        if (list != null) {
                            numValueOf = Integer.valueOf(list.size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        C385200F8k.LIZ("PhotoTemplatePanelView", C2188811AlT.LIZIZ(sbLIZ2));
                        List<Asset> list2 = assetPanelModel.asset_list;
                        if (list2 != null && !list2.isEmpty()) {
                            c1428050nGVLLLLLLL2.LIZJ(false);
                            c1428050nGVLLLLLLL2.LJI.setData(assetPanelModel.category_list);
                            C1427950nGL c1427950nGL = c1428050nGVLLLLLLL2.LJFF;
                            List<Asset> list3 = assetPanelModel.asset_list;
                            if (list3 != null) {
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                Iterator<Asset> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(C1413020msG.LIZLLL(it2.next()));
                                }
                                c1427950nGL.setData(arrayList);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            c1428050nGVLLLLLLL2.LIZJ(true);
                        }
                        this.LL.LLJL.setValue(new C1427880nGE(null));
                        if (z || z2) {
                            List<Asset> list4 = assetPanelModel.asset_list;
                            if (list4 != null && (asset = (Asset) C13LP.LJJJLL(list4)) != null) {
                                photoTemplateAssetLIZLLL = C1413020msG.LIZLLL(asset);
                            }
                            awS388S0200000_22.invoke(photoTemplateAssetLIZLLL);
                        }
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        C1C7U.LIZIZ("PhotoTemplateScene@59f2.fetchPanel$1");
                    }
                }, new AfS191S0100000_22(this, 9)));
                return;
            }
            final C1424090nA7 c1424090nA7 = this.LLJJJJJIL;
            final String category_key = categoryInfo.getCategory_key();
            final String str = this.LLLF;
            c1424090nA7.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchPanelCategory from category:");
            sbLIZ2.append(category_key);
            sbLIZ2.append(", ignoreCache:");
            sbLIZ2.append(z);
            sbLIZ2.append(", path:");
            sbLIZ2.append("");
            C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ2));
            C371780Ehs.LIZ(this.LLJZIJLIL, AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0nA6
                public final /* synthetic */ String LL = "";

                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<AssetCategoryModel> interfaceC2329309At) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LL);
                    sbLIZ3.append(category_key);
                    final C1424130nAB c1424130nAB = new C1424130nAB(C2188811AlT.LIZIZ(sbLIZ3), str);
                    AssetCategoryModel assetCategoryModel = c1424090nA7.LIZLLL.get(c1424130nAB);
                    if (assetCategoryModel != null && !z) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("fetchPanelCategory hit cache for path: ");
                        sbLIZ4.append(this.LL);
                        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ4));
                        interfaceC2329309At.onSuccess(assetCategoryModel);
                        return;
                    }
                    InterfaceC1635410sex interfaceC1635410sex = c1424090nA7.LIZIZ;
                    int i = C0BSV.LIZ;
                    IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                    if (iToolsDebugGpService != null) {
                        iToolsDebugGpService.isOpen();
                    }
                    MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo = new MixedAssetsRequestBodyInfo("photomode_template", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AwS171S1100000_22(c1424090nA7, str, 13), null, null, "", "", "", null, null, null, null, Boolean.FALSE, null, "", null);
                    Pair<String, String> pair = pairLIZJ;
                    C1429050nI7.LIZ.getClass();
                    Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
                    MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pair, "2", null, null, null, false, null, null, false);
                    final C1424090nA7 c1424090nA72 = c1424090nA7;
                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                    interfaceC1635410sex.LJIILL(mixedAssetsQueryAdditionalParameters, "photomode_template", category_key, 0, i, mixedAssetsRequestBodyInfo, new IFetchAssetCategoryInfo() { // from class: X.0n9z
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo
                        public final void onFailed(ExceptionResult exceptionResult) {
                            Exception runtimeException;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("fetchPanelCategory failed: ");
                            sbLIZ5.append(exceptionResult);
                            C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ5));
                            InterfaceC2329309At<AssetCategoryModel> interfaceC2329309At2 = c11kt;
                            if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                                runtimeException = new RuntimeException("fetchPanelCategory onFailed: null exception");
                            }
                            interfaceC2329309At2.onError(runtimeException);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(AssetCategoryResponse assetCategoryResponse) {
                            boolean z3;
                            AssetCategoryModel data;
                            AssetCategoryModel data2;
                            List<Asset> list;
                            AssetCategoryResponse assetCategoryResponse2 = assetCategoryResponse;
                            if (assetCategoryResponse2 != null && assetCategoryResponse2.getStatus_code() == 0 && assetCategoryResponse2.getData() != null && (data2 = assetCategoryResponse2.getData()) != null && (list = data2.asset_list) != null && (!list.isEmpty())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            AssetCategoryModel data3 = null;
                            ArrayList arrayList = null;
                            if (z3) {
                                if (assetCategoryResponse2 != null && (data = assetCategoryResponse2.getData()) != null) {
                                    AssetCategoryModel assetCategoryModelCopy = data;
                                    if (c1424090nA72.LIZ) {
                                        List<Asset> list2 = data.asset_list;
                                        if (list2 != null) {
                                            arrayList = new ArrayList();
                                            for (Asset asset : list2) {
                                                if (asset.getAsset_type() != AssetType.PHOTO_EFFECT.getValue()) {
                                                    arrayList.add(asset);
                                                }
                                            }
                                        }
                                        boolean zLJFF = Intrinsics.LJFF(arrayList, data.asset_list);
                                        assetCategoryModelCopy = data;
                                        if (!zLJFF) {
                                            assetCategoryModelCopy = data.copy(data.category_key, data.category_name, data.icon_url, data.filtered_asset_list, data.has_more, data.next_position, data.recommend_req_id, arrayList, data.loki_version, data.url_prefix);
                                        }
                                    }
                                    c1424090nA72.LIZLLL.put(c1424130nAB, assetCategoryModelCopy);
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("fetchPanelCategory onSuccess: ");
                                    sbLIZ5.append(assetCategoryModelCopy);
                                    C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ5));
                                    c11kt.onSuccess(assetCategoryModelCopy);
                                    return;
                                }
                                "Required value was null.".toString();
                                throw new IllegalStateException("Required value was null.");
                            }
                            InterfaceC2329309At<AssetCategoryModel> interfaceC2329309At2 = c11kt;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("fetchPanelCategory onFailed: null panel model ");
                            if (assetCategoryResponse2 != null) {
                                data3 = assetCategoryResponse2.getData();
                            }
                            sbLIZ6.append(data3);
                            interfaceC2329309At2.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ6)));
                        }
                    });
                }
            }).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0nGT
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Integer numValueOf;
                    Asset asset;
                    C1C7U.LIZ("PhotoTemplateScene@59f2.fetchPanel$3");
                    AssetCategoryModel assetCategoryModel = (AssetCategoryModel) obj;
                    C385200F8k.LIZJ("PhotoTemplateScene", "fetchPanelCategory succeed");
                    C1428050nGV c1428050nGVLLLLLLL2 = this.LL.LLLLLLL();
                    c1428050nGVLLLLLLL2.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("updatePanel, asset_list:");
                    List<Asset> list = assetCategoryModel.asset_list;
                    PhotoTemplateAsset photoTemplateAssetLIZLLL = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ3.append(numValueOf);
                    C385200F8k.LIZ("PhotoTemplatePanelView", C2188811AlT.LIZIZ(sbLIZ3));
                    List<Asset> list2 = assetCategoryModel.asset_list;
                    if (list2 != null && !list2.isEmpty()) {
                        c1428050nGVLLLLLLL2.LIZJ(false);
                        C1427950nGL c1427950nGL = c1428050nGVLLLLLLL2.LJFF;
                        List<Asset> list3 = assetCategoryModel.asset_list;
                        if (list3 != null) {
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                            Iterator<Asset> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(C1413020msG.LIZLLL(it2.next()));
                            }
                            c1427950nGL.setData(arrayList);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        c1428050nGVLLLLLLL2.LIZJ(true);
                    }
                    this.LL.LLJL.setValue(new C1427880nGE(categoryInfo));
                    if (z || z2) {
                        List<Asset> list4 = assetCategoryModel.asset_list;
                        if (list4 != null && (asset = (Asset) C13LP.LJJJLL(list4)) != null) {
                            photoTemplateAssetLIZLLL = C1413020msG.LIZLLL(asset);
                        }
                        awS388S0200000_22.invoke(photoTemplateAssetLIZLLL);
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    C1C7U.LIZIZ("PhotoTemplateScene@59f2.fetchPanel$3");
                }
            }, new AfS191S0100000_22(this, 10)));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }
}
