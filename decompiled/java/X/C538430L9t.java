package X;

import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0L9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$onCreate$5", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C538430L9t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractActivityC559670LxF LL;
    public final /* synthetic */ CutSource LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AbstractBinderC539770LEx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538430L9t(AbstractActivityC559670LxF abstractActivityC559670LxF, CutSource cutSource, String str, AbstractBinderC539770LEx abstractBinderC539770LEx, InterfaceC1364105Vn<? super C538430L9t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractActivityC559670LxF;
        this.LLILLJJLI = cutSource;
        this.LLILLL = str;
        this.LLILZ = abstractBinderC539770LEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538430L9t(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutPlayerActivity@2b06.onCreate$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLETemplateSource nLETemplateSource = new NLETemplateSource(this.LL, this.LLILLJJLI, this.LLILLL);
        AbstractActivityC559670LxF abstractActivityC559670LxF = this.LL;
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILZ;
        nLETemplateSource.LJIIIIZZ(new C19859212n0(new C19858912mx(abstractActivityC559670LxF)));
        final WeakReference weakReference = new WeakReference(abstractActivityC559670LxF);
        nLETemplateSource.LIZ(new NLEPrepareListener(weakReference) { // from class: X.0FQ5
            public final WeakReference<AbstractActivityC559670LxF> LIZ;

            public final AbstractActivityC559670LxF LIZ() {
                AbstractActivityC559670LxF abstractActivityC559670LxF2 = this.LIZ.get();
                if (abstractActivityC559670LxF2 == null || abstractActivityC559670LxF2.isFinishing() || abstractActivityC559670LxF2.isDestroyed()) {
                    return null;
                }
                return abstractActivityC559670LxF2;
            }

            {
                this.LIZ = weakReference;
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                ArrayList<MediaItem> arrayListLIZ;
                ArrayList<TextItem> arrayListLIZIZ;
                ArrayList<MediaItem> arrayList;
                ArrayList<TextItem> arrayList2;
                TextItem next;
                VecNLETrackSlotSPtr mutableAssetItems;
                if (nLETemplateModel != null) {
                    arrayListLIZ = C0FQ1.LIZ(nLETemplateModel);
                    arrayListLIZIZ = C0FQ1.LIZIZ(nLETemplateModel);
                } else {
                    arrayListLIZ = null;
                    arrayListLIZIZ = null;
                }
                AbstractActivityC559670LxF abstractActivityC559670LxFLIZ = LIZ();
                int i = 0;
                if (abstractActivityC559670LxFLIZ != null) {
                    if (nLETemplateModel == null || nLETemplateModel.getTemplateInfo() == null) {
                        abstractActivityC559670LxFLIZ.finish();
                    }
                    if (nLETemplateModel == null || (mutableAssetItems = nLETemplateModel.getMutableAssetItems()) == null || mutableAssetItems.isEmpty()) {
                        abstractActivityC559670LxFLIZ.finish();
                    }
                }
                AbstractActivityC559670LxF abstractActivityC559670LxFLIZ2 = LIZ();
                if (abstractActivityC559670LxFLIZ2 != null) {
                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPreparePreSuccess : ");
                    sbLIZ.append(arrayListLIZ);
                    sbLIZ.append(", ");
                    sbLIZ.append(arrayListLIZIZ);
                    C559870LxZ.LIZJ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
                    if (arrayListLIZ != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (MediaItem mediaItem : arrayListLIZ) {
                            if (mediaItem.isMutable) {
                                arrayList3.add(mediaItem);
                            }
                        }
                        arrayList = new ArrayList<>(arrayList3);
                    } else {
                        arrayList = null;
                    }
                    if (arrayListLIZIZ != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (TextItem textItem : arrayListLIZIZ) {
                            if (textItem.mutable) {
                                arrayList4.add(textItem);
                            }
                        }
                        arrayList2 = new ArrayList<>(arrayList4);
                    } else {
                        arrayList2 = null;
                    }
                    ArrayList<MediaItem> arrayList5 = abstractActivityC559670LxFLIZ2.LLJJJIL;
                    if (arrayList != null && arrayList5 != null) {
                        AbstractActivityC559670LxF.LLLLZLLLI(arrayList, arrayList5);
                    }
                    abstractActivityC559670LxFLIZ2.LLJJJIL = arrayList;
                    ArrayList<TextItem> arrayList6 = abstractActivityC559670LxFLIZ2.LLJJJJ;
                    if (arrayList2 != null && arrayList6 != null) {
                        for (TextItem textItem2 : arrayList2) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                TextItem textItem3 = textItem2;
                                if (textItem3.mutable) {
                                    Iterator<TextItem> it2 = arrayList6.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (Intrinsics.LJFF(next.materialId, textItem3.materialId)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    TextItem textItem4 = next;
                                    if (textItem4 != null) {
                                        TextItem textItem5 = (TextItem) ListProtector.get(arrayList2, i);
                                        ListProtector.set(arrayList2, i, new TextItem(textItem5.duration, textItem5.mutable, textItem5.materialId, textItem5.rotation, textItem5.targetStartTime, textItem4.text));
                                    }
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    abstractActivityC559670LxFLIZ2.LLJJJJ = arrayList2;
                    if (!abstractActivityC559670LxFLIZ2.LLJJJ && !abstractActivityC559670LxFLIZ2.LLJJIJIL && !abstractActivityC559670LxFLIZ2.LLJJIJIIJIL) {
                        abstractActivityC559670LxFLIZ2.LLLLZI();
                    }
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                ArrayList<MediaItem> arrayListLIZ;
                ArrayList<TextItem> arrayListLIZIZ = null;
                if (nLETemplateModel != null) {
                    arrayListLIZ = C0FQ1.LIZ(nLETemplateModel);
                    arrayListLIZIZ = C0FQ1.LIZIZ(nLETemplateModel);
                } else {
                    arrayListLIZ = null;
                }
                if (LIZ() != null) {
                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPrepareSuccess : ");
                    sbLIZ.append(arrayListLIZ);
                    sbLIZ.append(", ");
                    sbLIZ.append(arrayListLIZIZ);
                    C559870LxZ.LIZJ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str) {
                AbstractActivityC559670LxF abstractActivityC559670LxFLIZ = LIZ();
                if (abstractActivityC559670LxFLIZ != null) {
                    InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPrepareError : ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(str);
                    C559870LxZ.LIZIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ), null);
                    C786410Ut5.me(abstractActivityC559670LxFLIZ, 0);
                    abstractActivityC559670LxFLIZ.finish();
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str) {
                LIZ();
            }
        });
        nLETemplateSource.LJIIIZ(abstractBinderC539770LEx);
        nLETemplateSource.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutPlayerActivity@2b06.onCreate$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
