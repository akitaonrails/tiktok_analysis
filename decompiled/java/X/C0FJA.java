package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FJA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJA {
    public static final C0FJA LIZ = new C0FJA();
    public static final InterfaceC1635410sex LIZIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);

    public static void LIZ(final VideoPublishEditModel videoPublishEditModel, final Effect effect, final Function1 function1) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(C533090KvT.LIZIZ.LIZIZ());
        final String strLJ = TextTemplateTools.LJ(effect);
        if (strLJ.length() == 0) {
            LIZIZ(effect, null, function1);
        } else {
            mapLJIIJ.put("panel", "text_template_typeface");
            LIZIZ.Cg(C1697810uHb.LJ(strLJ), mapLJIIJ, new IFetchEffectListByIdsListener() { // from class: X.0FJB
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    String str = strLJ;
                    c1402910mbx.getClass();
                    C1402910mbx.LIZLLL(jCurrentTimeMillis2, videoPublishEditModel2, str, "", false, true, false);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    final Effect effect2;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect2 = (Effect) C13LP.LJJJLZIJ(0, data)) != null) {
                        final Effect effect3 = effect;
                        final Function1<C0FMO, Unit> function12 = function1;
                        final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                        final long j = jCurrentTimeMillis;
                        final String str = strLJ;
                        C0FJA.LIZ.getClass();
                        InterfaceC1635410sex interfaceC1635410sex = C0FJA.LIZIZ;
                        if (interfaceC1635410sex.LJIIIIZZ(effect2)) {
                            C0FJA.LIZIZ(effect3, effect2, function12);
                            C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            c1402910mbx.getClass();
                            C1402910mbx.LIZLLL(jCurrentTimeMillis2, videoPublishEditModel2, str, "", true, true, true);
                            return;
                        }
                        interfaceC1635410sex.LIZJ(effect2, new IFetchEffectListener() { // from class: X.0FJC
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect4) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(Effect effect4) {
                                C0FJA c0fja = C0FJA.LIZ;
                                Effect effect5 = effect3;
                                Effect effect6 = effect2;
                                Function1<C0FMO, Unit> function13 = function12;
                                c0fja.getClass();
                                C0FJA.LIZIZ(effect5, effect6, function13);
                                C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                                String str2 = str;
                                c1402910mbx2.getClass();
                                C1402910mbx.LIZLLL(jCurrentTimeMillis3, videoPublishEditModel3, str2, "", true, true, false);
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect4, ExceptionResult exceptionResult) {
                                C1402910mbx c1402910mbx2 = C1402910mbx.LIZ;
                                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel2;
                                long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                                String str2 = str;
                                c1402910mbx2.getClass();
                                C1402910mbx.LIZLLL(jCurrentTimeMillis3, videoPublishEditModel3, str2, "", false, true, false);
                            }
                        });
                    }
                }
            });
        }
    }

    public static void LIZIZ(Effect effect, Effect effect2, Function1 function1) {
        String unzipPath;
        if (effect2 != null) {
            unzipPath = effect2.getUnzipPath();
        } else {
            unzipPath = null;
        }
        String strLJFF = TextTemplateTools.LJFF(unzipPath);
        String strLIZLLL = TextTemplateTools.LIZLLL(effect.getUnzipPath());
        String strLJI = TextTemplateTools.LJI(effect.getUnzipPath());
        if (strLJFF != null) {
            function1.invoke(new C0FMO(effect, effect2, strLJFF, strLIZLLL, strLJI));
        }
    }
}
