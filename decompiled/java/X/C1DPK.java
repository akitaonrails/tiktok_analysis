package X;

import com.bytedance.ies.effecteditor.swig.EffectEditorJniJNI;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAsset;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetItem;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetItemUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationBase;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCache;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCacheUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategory;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategoryPtrVector;
import com.bytedance.ies.effecteditor.swig.UIAnnotationError;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationOptionList;
import com.bytedance.ies.effecteditor.swig.UIAnnotationOptionListUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationParser;
import com.bytedance.ies.effecteditor.swig.UIAnnotationSlider;
import com.bytedance.ies.effecteditor.swig.UIAnnotationSliderUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInput;
import com.bytedance.ies.effecteditor.swig.UIAnnotationTextInputUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DPK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DPK {
    public final UIAnnotationParser LIZ;
    public String LIZIZ;
    public String LIZJ;
    public AbstractC1665240tR4<?, ?>[] LIZLLL;
    public C1643340srk[] LJ;
    public Map<String, C1643340srk> LJFF;

    public final String[] LIZIZ() {
        String[] strArr;
        synchronized (this) {
            try {
                strArr = new String[this.LIZ.getTags().size()];
                this.LIZ.getTags().toArray(strArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strArr;
    }

    static {
        synchronized (C1DPK.class) {
            try {
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset, new C1DPJ() { // from class: X.1DPG
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, C1DPK c1dpk) {
                        return new C1DPB(UIAnnotationAsset.dynamicCast(uIAnnotationBase), c1dpk);
                    }
                });
                EffectEditorJniJNI.UIAnnotationAsset_injectUIAnnotation();
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Slider, new C1DPJ() { // from class: X.1DPP
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, C1DPK c1dpk) {
                        return new AbstractC1665240tR4<C1DPS, UIAnnotationSlider>(UIAnnotationSlider.dynamicCast(uIAnnotationBase), c1dpk) { // from class: X.1DPO
                            @Override // X.AbstractC1665240tR4
                            public final UIAnnotationErrorCode LIZIZ() {
                                U u = this.LIZJ;
                                return u == 0 ? UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr : u.refreshAnnotationPreview();
                            }

                            {
                                super(uIAnnotationSlider, c1dpk);
                                if (uIAnnotationSlider == null) {
                                    return;
                                }
                                final UIAnnotationSliderUIMore uIAnnotationSliderUIMoreDynamicCast = UIAnnotationSliderUIMore.dynamicCast(uIAnnotationSlider.getUIMore());
                                this.LIZ = new C1DPS(uIAnnotationSliderUIMoreDynamicCast) { // from class: X.1DPT
                                };
                            }
                        };
                    }
                });
                EffectEditorJniJNI.UIAnnotationSlider_injectUIAnnotation();
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_TextInput, new C1DPJ() { // from class: X.1DPF
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, C1DPK c1dpk) {
                        return new AbstractC1665240tR4<AbstractC1665310tRB, UIAnnotationTextInput>(UIAnnotationTextInput.dynamicCast(uIAnnotationBase), c1dpk) { // from class: X.1DPC
                            @Override // X.AbstractC1665240tR4
                            public final UIAnnotationErrorCode LIZIZ() {
                                U u = this.LIZJ;
                                return u == 0 ? UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr : u.refreshAnnotationPreview();
                            }

                            {
                                super(uIAnnotationTextInput, c1dpk);
                                if (uIAnnotationTextInput == null) {
                                    return;
                                }
                                final UIAnnotationTextInputUIMore uIAnnotationTextInputUIMoreDynamicCast = UIAnnotationTextInputUIMore.dynamicCast(uIAnnotationTextInput.getUIMore());
                                this.LIZ = new AbstractC1665310tRB(uIAnnotationTextInputUIMoreDynamicCast) { // from class: X.0tRC
                                };
                            }
                        };
                    }
                });
                EffectEditorJniJNI.UIAnnotationTextInput_injectUIAnnotation();
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_OptionList, new C1DPJ() { // from class: X.1DPE
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, C1DPK c1dpk) {
                        return new AbstractC1665240tR4<AbstractC1665330tRD, UIAnnotationOptionList>(UIAnnotationOptionList.dynamicCast(uIAnnotationBase), c1dpk) { // from class: X.1DPD
                            @Override // X.AbstractC1665240tR4
                            public final UIAnnotationErrorCode LIZIZ() {
                                U u = this.LIZJ;
                                return u == 0 ? UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr : u.refreshAnnotationPreview();
                            }

                            {
                                super(uIAnnotationOptionList, c1dpk);
                                if (uIAnnotationOptionList == null) {
                                    return;
                                }
                                this.LIZ = new AbstractC1665330tRD(UIAnnotationOptionListUIMore.dynamicCast(uIAnnotationOptionList.getUIMore())) { // from class: X.0tRE
                                };
                            }
                        };
                    }
                });
                EffectEditorJniJNI.UIAnnotationOptionList_injectUIAnnotation();
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Cache, new C1DPJ() { // from class: X.1DPM
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, final C1DPK c1dpk) {
                        final UIAnnotationCache uIAnnotationCacheDynamicCast = UIAnnotationCache.dynamicCast(uIAnnotationBase);
                        return new AbstractC1665240tR4<C1DPR, UIAnnotationCache>(uIAnnotationCacheDynamicCast, c1dpk) { // from class: X.1DPN
                            @Override // X.AbstractC1665240tR4
                            public final UIAnnotationErrorCode LIZIZ() {
                                U u = this.LIZJ;
                                return u == 0 ? UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr : u.refreshAnnotationPreview();
                            }

                            {
                                super(uIAnnotationCacheDynamicCast, c1dpk);
                                if (uIAnnotationCacheDynamicCast == null) {
                                    return;
                                }
                                final UIAnnotationCacheUIMore uIAnnotationCacheUIMoreDynamicCast = UIAnnotationCacheUIMore.dynamicCast(uIAnnotationCacheDynamicCast.getUIMore());
                                this.LIZ = new C1DPR(uIAnnotationCacheUIMoreDynamicCast) { // from class: X.1DPQ
                                };
                            }
                        };
                    }
                });
                EffectEditorJniJNI.UIAnnotationCache_injectUIAnnotation();
                C1DPL.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_AssetItem, new C1DPJ() { // from class: X.1DPI
                    @Override // X.C1DPJ
                    public final AbstractC1665240tR4 LIZ(UIAnnotationBase uIAnnotationBase, C1DPK c1dpk) {
                        return new C1DPB(UIAnnotationAssetItem.dynamicCast(uIAnnotationBase), c1dpk) { // from class: X.1DPH
                            {
                                super(uIAnnotationAssetItem, c1dpk);
                                final UIAnnotationAssetItemUIMore uIAnnotationAssetItemUIMoreDynamicCast = UIAnnotationAssetItemUIMore.dynamicCast(uIAnnotationAssetItem.getUIMore());
                                this.LIZ = new AbstractC1665280tR8(uIAnnotationAssetItemUIMoreDynamicCast) { // from class: X.0tR9
                                };
                            }
                        };
                    }
                });
                EffectEditorJniJNI.UIAnnotationAssetItem_injectUIAnnotation();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final UIAnnotationErrorCode LIZJ() {
        if (!this.LIZ.getStickerPathChanged()) {
            return UIAnnotationErrorCode.UIAnnotationErrorCode_None;
        }
        synchronized (this) {
            try {
                if (!this.LIZ.getStickerPathChanged()) {
                    return UIAnnotationErrorCode.UIAnnotationErrorCode_None;
                }
                UIAnnotationError uIAnnotationError = new UIAnnotationError();
                this.LIZLLL = LIZLLL(uIAnnotationError);
                return uIAnnotationError.getErrorCode();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1DPK() {
        this.LIZ = new UIAnnotationParser();
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    public final AbstractC1665240tR4<?, ?>[] LIZ(UIAnnotationUIType uIAnnotationUIType) {
        UIAnnotationUIType uIType;
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4Arr = this.LIZLLL;
        if (abstractC1665240tR4Arr == null || abstractC1665240tR4Arr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.LIZLLL.length);
        for (AbstractC1665240tR4<?, ?> abstractC1665240tR4 : this.LIZLLL) {
            U u = abstractC1665240tR4.LIZJ;
            if (u != 0) {
                uIType = u.getUIType();
            } else {
                uIType = UIAnnotationUIType.UIAnnotationUIType_Unknown;
            }
            if (uIType == uIAnnotationUIType) {
                arrayList.add(abstractC1665240tR4);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4Arr2 = new AbstractC1665240tR4[arrayList.size()];
        arrayList.toArray(abstractC1665240tR4Arr2);
        return abstractC1665240tR4Arr2;
    }

    public final AbstractC1665240tR4<?, ?>[] LIZLLL(UIAnnotationError uIAnnotationError) {
        C1DPJ c1dpj;
        AbstractC1665240tR4<?, ?> abstractC1665240tR4LIZ;
        this.LJ = null;
        this.LJFF = null;
        int size = this.LIZ.getUIAnnotationVector(uIAnnotationError).size();
        UIAnnotationBase[] uIAnnotationBaseArr = new UIAnnotationBase[size];
        this.LIZ.getUIAnnotationVector(uIAnnotationError).toArray(uIAnnotationBaseArr);
        if (uIAnnotationError.getErrorCode() != UIAnnotationErrorCode.UIAnnotationErrorCode_None || size <= 0) {
            return null;
        }
        UIAnnotationCategoryPtrVector uIAnnotationCategoryVector = this.LIZ.getUIAnnotationCategoryVector();
        int i = 0;
        if (uIAnnotationCategoryVector.size() > 0) {
            this.LJ = new C1643340srk[uIAnnotationCategoryVector.size()];
            this.LJFF = new HashMap();
            for (int i2 = 0; i2 < uIAnnotationCategoryVector.size(); i2++) {
                UIAnnotationCategory uIAnnotationCategory = uIAnnotationCategoryVector.get(i2);
                String name = uIAnnotationCategory.getName();
                uIAnnotationCategory.getIconPath();
                C1643340srk c1643340srk = new C1643340srk(name);
                this.LJ[i2] = c1643340srk;
                ((HashMap) this.LJFF).put(name, c1643340srk);
            }
        }
        ArrayList arrayList = new ArrayList(size);
        do {
            UIAnnotationBase uIAnnotationBase = uIAnnotationBaseArr[i];
            if (uIAnnotationBase != null) {
                UIAnnotationUIType uIType = uIAnnotationBase.getUIType();
                if (((HashMap) C1DPL.LIZ().LIZ).containsKey(uIType) && (c1dpj = (C1DPJ) ((HashMap) C1DPL.LIZ().LIZ).get(uIType)) != null && (abstractC1665240tR4LIZ = c1dpj.LIZ(uIAnnotationBase, this)) != null) {
                    if (abstractC1665240tR4LIZ instanceof C1DPB) {
                        ((C1DPB) abstractC1665240tR4LIZ).LIZJ(this.LIZJ);
                    }
                    if (abstractC1665240tR4LIZ instanceof C1DPH) {
                        ((C1DPB) abstractC1665240tR4LIZ).LIZJ(this.LIZJ);
                    }
                    arrayList.add(abstractC1665240tR4LIZ);
                }
            }
            i++;
        } while (i < size);
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC1665240tR4<?, ?>[] abstractC1665240tR4Arr = new AbstractC1665240tR4[arrayList.size()];
        arrayList.toArray(abstractC1665240tR4Arr);
        return abstractC1665240tR4Arr;
    }

    public final void LJ(String str) {
        if (str == null) {
            return;
        }
        synchronized (this) {
            try {
                this.LIZ.removeTag(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(String str) {
        String str2 = this.LIZIZ;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        synchronized (this) {
            try {
                this.LIZIZ = str;
                UIAnnotationParser uIAnnotationParser = this.LIZ;
                if (str == null) {
                    str = "";
                }
                uIAnnotationParser.setLocalePath(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1DPK(String str, String str2) {
        this();
        String str3 = this.LIZJ;
        if (str3 != null ? !str3.equals(str) : str != null) {
            synchronized (this) {
                try {
                    this.LIZJ = str;
                    this.LIZ.setStickerPath(str == null ? "" : str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJFF(str2);
    }
}
