package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.MusicSyncResult;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.SamiChorusRes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14Le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointVideoPresenter$startDefaultStickPointNew$1$2", f = "StickPointVideoPresenter.kt", l = {491, 493}, m = "invokeSuspend")
public final class C20249614Le extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends List<Integer>>>, Object> {
    public int LL;
    public final /* synthetic */ C1463030oAv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20249614Le(C1463030oAv c1463030oAv, InterfaceC1364105Vn<? super C20249614Le> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1463030oAv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20249614Le(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AVMusic aVMusic;
        StickPointMusicAlg stickPointMusicAlg;
        int duration;
        String noStrengthBeatsPath;
        String chorusPath;
        int iIntValue;
        StickPointMusicAlg stickPointMusicAlg2;
        StickPointMusicAlg stickPointMusicAlg3;
        AVMusic aVMusic2;
        StickPointMusicAlg stickPointMusicAlg4;
        int duration2;
        String musicSyncPath;
        String chorusPath2;
        double dDoubleValue;
        StickPointMusicAlg stickPointMusicAlg5;
        StickPointMusicAlg stickPointMusicAlg6;
        Object pair = obj;
        C1C7U.LIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(pair);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(pair);
            int i2 = 4;
            int i3 = 0;
            i3 = 0;
            if (C1420940n52.LIZIZ()) {
                C1463030oAv c1463030oAv = this.LLILLJJLI;
                this.LL = 1;
                if (c1463030oAv.LJI == null) {
                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList();
                    InterfaceC1463300oBM interfaceC1463300oBM = c1463030oAv.LJI;
                    if (interfaceC1463300oBM != null) {
                        Iterator<VideoSegment> it2 = interfaceC1463300oBM.LIZJ().iterator();
                        while (it2.hasNext()) {
                            if (C2471909mP.LJJIII(it2.next().LJFF(false), false, i2)) {
                                arrayList.add(new Material(EnumC2005707tP.IMAGE, 0.0d));
                            } else {
                                arrayList.add(new Material(EnumC2005707tP.VIDEO, r4.duration / 1000.0d));
                                i2 = 4;
                            }
                        }
                    }
                    if (c1463030oAv.LIZJ != null && !arrayList.isEmpty() && (aVMusic2 = c1463030oAv.LIZJ) != null && (stickPointMusicAlg4 = aVMusic2.getStickPointMusicAlg()) != null && stickPointMusicAlg4.getMusicSyncPath() != null) {
                        AVMusic aVMusic3 = c1463030oAv.LIZJ;
                        if (aVMusic3 != null) {
                            duration2 = aVMusic3.getDuration();
                        } else {
                            duration2 = 0;
                        }
                        double d = ((double) duration2) / 1000.0d;
                        if (d == 0.0d) {
                            pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                        } else {
                            C20249914Lh c20249914Lh = C20249914Lh.LIZ;
                            AVMusic aVMusic4 = c1463030oAv.LIZJ;
                            if (aVMusic4 != null && (stickPointMusicAlg6 = aVMusic4.getStickPointMusicAlg()) != null) {
                                musicSyncPath = stickPointMusicAlg6.getMusicSyncPath();
                            } else {
                                musicSyncPath = null;
                            }
                            c20249914Lh.getClass();
                            MusicSyncResult musicSyncResultLIZJ = C20249914Lh.LIZJ(musicSyncPath);
                            if (musicSyncResultLIZJ == null) {
                                pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                            } else {
                                AVMusic aVMusic5 = c1463030oAv.LIZJ;
                                if (aVMusic5 != null && (stickPointMusicAlg5 = aVMusic5.getStickPointMusicAlg()) != null) {
                                    chorusPath2 = stickPointMusicAlg5.getChorusPath();
                                } else {
                                    chorusPath2 = null;
                                }
                                SamiChorusRes samiChorusResLIZIZ = C20249914Lh.LIZIZ(chorusPath2);
                                C20249814Lg.LIZ.getClass();
                                MusicSyncResult musicSyncResultLJ = C20249814Lg.LJ(arrayList, d, musicSyncResultLIZJ, samiChorusResLIZIZ);
                                if (musicSyncResultLJ == null) {
                                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.addAll(musicSyncResultLJ.predSec);
                                    arrayList3.add(C2286608xc.LIZJ(musicSyncResultLJ.durationSec));
                                    int i4 = 0;
                                    for (Object obj2 : arrayList3) {
                                        int i5 = i4 + 1;
                                        if (i4 >= 0) {
                                            ((Number) obj2).doubleValue();
                                            if (i4 == 0) {
                                                dDoubleValue = 0.0d;
                                            } else {
                                                dDoubleValue = ((Number) ListProtector.get(arrayList3, i4 - 1)).doubleValue();
                                            }
                                            arrayList2.add(C2286608xc.LJ((int) ((((Number) ListProtector.get(arrayList3, i4)).doubleValue() - dDoubleValue) * ((double) LSPassThroughRecordSizeConfig.DEFAULT))));
                                            i4 = i5;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    if (arrayList2.isEmpty()) {
                                        pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                    } else if (!arrayList2.isEmpty()) {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            if (((Number) it3.next()).intValue() <= 0) {
                                                pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                                break;
                                            }
                                        }
                                        pair = new Pair(C2286608xc.LJ(0), arrayList2);
                                    } else {
                                        pair = new Pair(C2286608xc.LJ(0), arrayList2);
                                    }
                                }
                            }
                        }
                    } else {
                        pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                    }
                }
                if (pair == objLJFF) {
                    C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$2");
                    return objLJFF;
                }
            } else {
                C1463030oAv c1463030oAv2 = this.LLILLJJLI;
                this.LL = 2;
                if (c1463030oAv2.LJI == null) {
                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    InterfaceC1463300oBM interfaceC1463300oBM2 = c1463030oAv2.LJI;
                    if (interfaceC1463300oBM2 != null) {
                        Iterator<VideoSegment> it4 = interfaceC1463300oBM2.LIZJ().iterator();
                        while (it4.hasNext()) {
                            if (C2471909mP.LJJIII(it4.next().LJFF(i3), i3, 4)) {
                                arrayList4.add(new Material(EnumC2005707tP.IMAGE, 0.0d));
                            } else {
                                arrayList4.add(new Material(EnumC2005707tP.VIDEO, r6.duration / 1000.0d));
                                i3 = 0;
                            }
                        }
                    }
                    if (c1463030oAv2.LIZJ != null && !arrayList4.isEmpty() && (aVMusic = c1463030oAv2.LIZJ) != null && (stickPointMusicAlg = aVMusic.getStickPointMusicAlg()) != null && stickPointMusicAlg.getNoStrengthBeatsPath() != null) {
                        AVMusic aVMusic6 = c1463030oAv2.LIZJ;
                        if (aVMusic6 != null) {
                            duration = aVMusic6.getDuration();
                        } else {
                            duration = 0;
                        }
                        double d2 = ((double) duration) / 1000.0d;
                        if (d2 == 0.0d) {
                            pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                        } else {
                            C20249914Lh c20249914Lh2 = C20249914Lh.LIZ;
                            AVMusic aVMusic7 = c1463030oAv2.LIZJ;
                            if (aVMusic7 != null && (stickPointMusicAlg3 = aVMusic7.getStickPointMusicAlg()) != null) {
                                noStrengthBeatsPath = stickPointMusicAlg3.getNoStrengthBeatsPath();
                            } else {
                                noStrengthBeatsPath = null;
                            }
                            c20249914Lh2.getClass();
                            BeatTrackingData beatTrackingDataLIZ = C20249914Lh.LIZ(noStrengthBeatsPath);
                            if (beatTrackingDataLIZ == null) {
                                pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                            } else {
                                AVMusic aVMusic8 = c1463030oAv2.LIZJ;
                                if (aVMusic8 != null && (stickPointMusicAlg2 = aVMusic8.getStickPointMusicAlg()) != null) {
                                    chorusPath = stickPointMusicAlg2.getChorusPath();
                                } else {
                                    chorusPath = null;
                                }
                                SamiChorusRes samiChorusResLIZIZ2 = C20249914Lh.LIZIZ(chorusPath);
                                C20249814Lg.LIZ.getClass();
                                BeatTrackingData beatTrackingDataLIZLLL = C20249814Lg.LIZLLL(arrayList4, d2, beatTrackingDataLIZ, samiChorusResLIZIZ2);
                                if (beatTrackingDataLIZLLL == null) {
                                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                } else {
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(beatTrackingDataLIZLLL.timeMs);
                                    arrayList6.add(C2286608xc.LJ(beatTrackingDataLIZLLL.durationMs));
                                    int i6 = 0;
                                    for (Object obj3 : arrayList6) {
                                        int i7 = i6 + 1;
                                        if (i6 >= 0) {
                                            ((Number) obj3).intValue();
                                            if (i6 == 0) {
                                                iIntValue = 0;
                                            } else {
                                                iIntValue = ((Number) ListProtector.get(arrayList6, i6 - 1)).intValue();
                                            }
                                            arrayList5.add(C2286608xc.LJ(((Number) ListProtector.get(arrayList6, i6)).intValue() - iIntValue));
                                            i6 = i7;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    if (arrayList5.isEmpty()) {
                                        pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                    } else if (!arrayList5.isEmpty()) {
                                        Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            if (((Number) it5.next()).intValue() <= 0) {
                                                pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                                                break;
                                            }
                                        }
                                        pair = new Pair(C2286608xc.LJ(i3), arrayList5);
                                    } else {
                                        pair = new Pair(C2286608xc.LJ(i3), arrayList5);
                                    }
                                }
                            }
                        }
                    } else {
                        pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                    }
                }
                if (pair == objLJFF) {
                    C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("StickPointVideoPresenter@671e.startDefaultStickPointNew$1$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends List<Integer>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
