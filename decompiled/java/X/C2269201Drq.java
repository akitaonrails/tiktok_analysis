package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Drq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269201Drq extends C09AY implements Function0<C0M5U> {
    public C2269201Drq() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0M5U] */
    @Override // kotlin.jvm.functions.Function0
    public final C0M5U invoke() {
        return new IStoryDraftService() { // from class: X.0M5U
            public final C01GW LIZ = C452501pT.LIZIZ(new C0M5W());

            @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
            public final void deleteDraft(SimplePublishModel simplePublishModel) {
                C23250099c.LIZLLL((InterfaceC497601wk) this.LIZ.getValue(), null, null, new C0M5V(simplePublishModel, null), 3);
            }

            @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
            public final void getStoryDraftList(final Function1<? super List<PublishModel>, Unit> function1) {
                CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService != null) {
                    C844470XAv.LIZ.getClass();
                    if (!creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                        function1.invoke(C13BV.INSTANCE);
                        return;
                    }
                }
                C15O7.LIZIZ(new Callable() { // from class: X.0M5S
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z;
                        List<AwemeDraft> listQueryDraftList;
                        C1C7U.LIZ("StoryDraftServiceImpl@50ac.getStoryDraftList$1");
                        if (!((Boolean) C075N.LIZIZ.getValue()).booleanValue()) {
                            C524780Ki4.LIZ.start("av_story_draft_read", "start");
                        }
                        boolean zBooleanValue = ((Boolean) C280890Azf.LIZ.getValue()).booleanValue();
                        C0CHQ.LIZ().getPublishService().LJIIL();
                        boolean zLJIIL = C1436830nUf.LJIIL();
                        if (!zBooleanValue || zLJIIL) {
                            z = false;
                            if (!zBooleanValue && zLJIIL) {
                                C0CHQ.LIZ().getPublishService().LJIIL();
                                C1436830nUf.LJIJJLI(false);
                            }
                        } else {
                            z = true;
                        }
                        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("start getStoryDraftList draftReadOpt:");
                        sbLIZ.append(zBooleanValue);
                        sbLIZ.append(" haveRefreshPublishStoryDraftSp:");
                        sbLIZ.append(zLJIIL);
                        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                        if (zBooleanValue && zLJIIL) {
                            getClass();
                            C0CHQ.LIZ().getPublishService().LJIIL();
                            List<String> listLJIIJ = C1436830nUf.LJIIJ();
                            ArrayList arrayList = new ArrayList();
                            for (String str : listLJIIJ) {
                                if (str.length() > 0) {
                                    arrayList.add(str);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                listQueryDraftList = C13BV.INSTANCE;
                            } else {
                                C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("getStoryDraftListFromSp ");
                                sbLIZ2.append(arrayList);
                                C201955140j.LIZJ(c830690WiJ2, C2188811AlT.LIZIZ(sbLIZ2));
                                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new CreativeInfo((String) it2.next(), 0, null, 6, null));
                                }
                                listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().LJFF(new C0M4K(arrayList2, EnumC562220M3g.NORMAL, C0M4F.ALL));
                            }
                        } else {
                            listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, EnumC562220M3g.NORMAL, C0M4F.EXCEPT_TTN, null, 114));
                        }
                        C0M5U c0m5u = this.LL;
                        ArrayList arrayList3 = new ArrayList();
                        for (AwemeDraft awemeDraft : listQueryDraftList) {
                            c0m5u.getClass();
                            if (awemeDraft.LJIILL() && (!awemeDraft.LJJJI)) {
                                if (z) {
                                    C0CHQ.LIZ().getPublishService().LJIIL().LJ(awemeDraft.LIZ());
                                }
                                C1439030nYD.LIZ.getClass();
                                PublishModel publishModelLIZ = C1433610nPT.LIZ(C1439030nYD.LIZIZ(awemeDraft, null, false));
                                if (publishModelLIZ != null) {
                                    arrayList3.add(publishModelLIZ);
                                }
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : arrayList3) {
                            if (hashSet.add(((PublishModel) obj).creationId)) {
                                arrayList4.add(obj);
                            }
                        }
                        if (z) {
                            C0CHQ.LIZ().getPublishService().LJIIL();
                            C1436830nUf.LJIJJLI(true);
                        }
                        if (!((Boolean) C075N.LIZIZ.getValue()).booleanValue()) {
                            C524780Ki4.LIZ.end("av_story_draft_read", "end");
                        }
                        C1C7U.LIZIZ("StoryDraftServiceImpl@50ac.getStoryDraftList$1");
                        return arrayList4;
                    }
                }, C823050WQl.LIZLLL(), null).LJ(new InterfaceC2385309Wh() { // from class: X.0M5T
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        C1C7U.LIZ("StoryDraftServiceImpl@50ac.getStoryDraftList$2");
                        function1.invoke((List<PublishModel>) c15o7.LJIIL());
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("StoryDraftServiceImpl@50ac.getStoryDraftList$2");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            }
        };
    }
}
