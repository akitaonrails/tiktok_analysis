package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.TemplateInfo;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.AutoPickMediaModel;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LB7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AutoPickTemplateAssetDownloader$downloadTemplateWithNleSummary$1", f = "AutoPickTemplateAssetDownloader.kt", l = {276}, m = "invokeSuspend")
public final class C0LB7 extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends NLEModel>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1416490mxr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LB7(String str, C1416490mxr c1416490mxr, InterfaceC1364105Vn<? super C0LB7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1416490mxr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LB7 c0lb7 = new C0LB7(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0lb7.LLILLJJLI = obj;
        return c0lb7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickTemplateAssetDownloader@c432.downloadTemplateWithNleSummary$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            C201955140j.LIZJ(c0mj8, "AutoPickTemplateAssetDownloader -> downloadTemplateWithNleSummary: starting template resource download");
            NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(this.LLILLL);
            if (nLETemplateModelRestore == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoPickTemplateAssetDownloader -> ");
                sbLIZ.append("NLETemplateModel.restore() returned null, invalid nleSummary");
                C201955140j.LJII(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                c094d.LJIIJJI(new RuntimeException("NLETemplateModel.restore() returned null, invalid nleSummary"));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadTemplateWithNleSummary$1");
                return unit;
            }
            TemplateInfo templateInfo = nLETemplateModelRestore.getTemplateInfo();
            if (templateInfo != null) {
                templateInfo.clearMutableItems();
            }
            String strStore = nLETemplateModelRestore.store();
            C1416490mxr c1416490mxr = this.LLILZ;
            ITemplateResourceService iTemplateResourceService = c1416490mxr.LLILLL.LIZIZ;
            Context context = c1416490mxr.LL;
            CutSource cutSource = new CutSource(strStore, CutSourceType.JSON);
            C1419810n3D.LIZ.getClass();
            NLEModelDownloader nLEModelDownloader = (NLEModelDownloader) C1419810n3D.LJIIIZ.getValue();
            EnumC539100LCi enumC539100LCi = EnumC539100LCi.UGC;
            final C1416490mxr c1416490mxr2 = this.LLILZ;
            C0LB9.LIZ(iTemplateResourceService, context, cutSource, new C1428840nHm("", (Boolean) null, false, nLEModelDownloader, enumC539100LCi, (ICutReporter) null, false, false, new NLEPrepareListener() { // from class: X.0LB6
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                    VecNLETrackSlotSPtr sortedSlots;
                    NLEResourceAV aVFile;
                    AutoPickMediaModel next;
                    NLEResType nLEResType;
                    String resourceId;
                    NLESegment mainSegment;
                    NLEResourceAV aVFile2;
                    if (nLETemplateModel == null) {
                        return;
                    }
                    C0EYQ.LJI(nLETemplateModel, EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue(), null);
                    boolean z = true;
                    if (((Boolean) C0B7N.LIZ.getValue()).booleanValue()) {
                        c1416490mxr2.getClass();
                        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                        ArrayList<NLETrack> arrayList = new ArrayList();
                        for (NLETrack nLETrack : tracks) {
                            if (NLETrackType.AUDIO == nLETrack.getTrackType()) {
                                arrayList.add(nLETrack);
                            }
                        }
                        for (NLETrack nLETrack2 : arrayList) {
                            String extra = nLETrack2.getExtra("biz_extra_type");
                            if (Intrinsics.LJFF("text_read", extra) || Intrinsics.LJFF("record", extra)) {
                                String strLIZIZ = C555520LqY.LIZIZ(2131858354);
                                nLETrack2.setExtra("AudioTrackType", "DUB");
                                nLETrack2.setExtra("music_name", strLIZIZ);
                                for (NLETrackSlot nLETrackSlot : nLETrack2.getSlots()) {
                                    if (nLETrackSlot != null) {
                                        mainSegment = nLETrackSlot.getMainSegment();
                                    } else {
                                        mainSegment = null;
                                    }
                                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(mainSegment);
                                    if (nLESegmentAudioDynamicCast != null && (aVFile2 = nLESegmentAudioDynamicCast.getAVFile()) != null) {
                                        aVFile2.setResourceType(NLEResType.RECORD);
                                        aVFile2.setResourceName(strLIZIZ);
                                    }
                                }
                            }
                        }
                    }
                    List<AutoPickMediaModel> list = c1416490mxr2.LLILZ.invoke().creativeModel.autoPickModel.mediaList;
                    NLETrack mainTrack = nLETemplateModel.getMainTrack();
                    if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                        int i2 = 0;
                        for (NLETrackSlot nLETrackSlot2 : sortedSlots) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                                if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
                                    Iterator<AutoPickMediaModel> it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            String str = next.resId;
                                            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                                            if (resource == null || (resourceId = resource.getResourceId()) == null) {
                                                resourceId = null;
                                            }
                                            if (Intrinsics.LJFF(str, resourceId)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    AutoPickMediaModel autoPickMediaModel = next;
                                    if (autoPickMediaModel == null && (autoPickMediaModel = (AutoPickMediaModel) C13LP.LJJJLZIJ(i2, list)) == null) {
                                        C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("replaceLocalResources: no matching media for slot index=");
                                        sbLIZ2.append(i2);
                                        C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                                    } else if (!C2286708xd.LIZJ(autoPickMediaModel.filePath)) {
                                        C0MJ8 c0mj83 = C0MJ8.LIZIZ;
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("replaceLocalResources: skip slot ");
                                        sbLIZ3.append(i2);
                                        sbLIZ3.append(", file missing: ");
                                        sbLIZ3.append(autoPickMediaModel.filePath);
                                        C201955140j.LIZJ(c0mj83, C2188811AlT.LIZIZ(sbLIZ3));
                                        z = false;
                                    } else {
                                        aVFile.setResourceFile(autoPickMediaModel.filePath);
                                        if (autoPickMediaModel.isVideoType) {
                                            nLEResType = NLEResType.VIDEO;
                                        } else {
                                            nLEResType = NLEResType.IMAGE;
                                        }
                                        aVFile.setResourceType(nLEResType);
                                    }
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    C0MJ8 c0mj84 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("replaceLocalResources: replaced ");
                    sbLIZ4.append(list.size());
                    sbLIZ4.append(" media items, allResolved=");
                    sbLIZ4.append(z);
                    C201955140j.LIZJ(c0mj84, C2188811AlT.LIZIZ(sbLIZ4));
                    if (!z) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("AutoPickTemplateAssetDownloader -> ");
                        sbLIZ5.append("replaceLocalResources failed: media files missing (possible version directory race)");
                        C201955140j.LJII(c0mj84, C2188811AlT.LIZIZ(sbLIZ5));
                        c094d.LJIIJJI(new IllegalStateException("replaceLocalResources failed: media files missing (possible version directory race)"));
                        return;
                    }
                    C201955140j.LIZJ(c0mj84, "AutoPickTemplateAssetDownloader -> downloadTemplateWithNleSummary: downloadTemplate onSuccess");
                    c094d.LJIIIIZZ(new Pair<>(100, nLETemplateModel));
                    c094d.LJIIJJI(null);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i2, String str) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadTemplate onError: code=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(", message=");
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("AutoPickTemplateAssetDownloader -> ");
                    sbLIZ3.append(strLIZIZ);
                    C201955140j.LJII(c0mj82, C2188811AlT.LIZIZ(sbLIZ3));
                    c094d.LJIIJJI(new RuntimeException(strLIZIZ));
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str) {
                    c094d.LJIIIIZZ(new Pair<>(Integer.valueOf((int) (f * 100)), null));
                }
            }, 458), null, 24);
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(517);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadTemplateWithNleSummary$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickTemplateAssetDownloader@c432.downloadTemplateWithNleSummary$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends NLEModel>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
