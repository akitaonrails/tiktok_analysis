package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
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

/* JADX INFO: renamed from: X.14Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPointNew$1$1", f = "EditorProStickPointNLEHandler.kt", l = {621, 623}, m = "invokeSuspend")
public final class C20249514Ld extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends List<Integer>>>, Object> {
    public int LL;
    public final /* synthetic */ C357990E1t LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20249514Ld(C357990E1t c357990E1t, InterfaceC1364105Vn<? super C20249514Ld> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c357990E1t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20249514Ld(this.LLILLJJLI, interfaceC1364105Vn);
    }

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
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        NLEResType resourceType;
        long duration2;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        AVMusic aVMusic2;
        StickPointMusicAlg stickPointMusicAlg4;
        int duration3;
        String musicSyncPath;
        String chorusPath2;
        double dDoubleValue;
        StickPointMusicAlg stickPointMusicAlg5;
        StickPointMusicAlg stickPointMusicAlg6;
        VecNLETrackSPtr tracks2;
        NLETrack next2;
        VecNLETrackSlotSPtr sortedSlots2;
        NLEResType resourceType2;
        long duration4;
        NLEResourceNode resource3;
        NLEResourceNode resource4;
        Object pair = obj;
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1$1");
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
            if (C1420940n52.LIZIZ()) {
                C357990E1t c357990E1t = this.LLILLJJLI;
                this.LL = 1;
                c357990E1t.getClass();
                ArrayList arrayList = new ArrayList();
                C0E48 c0e48 = c357990E1t.LIZJ;
                if (c0e48 != null && (tracks2 = C350870DpF.LJI(c0e48).getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (next2.getMainTrack()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack = next2;
                    if (nLETrack != null && (sortedSlots2 = nLETrack.getSortedSlots()) != null) {
                        for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                            NLESegment mainSegment = nLETrackSlot.getMainSegment();
                            if (mainSegment != null && (resource4 = mainSegment.getResource()) != null) {
                                resourceType2 = resource4.getResourceType();
                            } else {
                                resourceType2 = null;
                            }
                            if (resourceType2 == NLEResType.IMAGE) {
                                arrayList.add(new Material(EnumC2005707tP.IMAGE, 0.0d));
                            } else {
                                EnumC2005707tP enumC2005707tP = EnumC2005707tP.VIDEO;
                                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                                if (mainSegment2 != null && (resource3 = mainSegment2.getResource()) != null) {
                                    duration4 = resource3.getDuration();
                                } else {
                                    duration4 = 0;
                                }
                                arrayList.add(new Material(enumC2005707tP, (duration4 / 1000.0d) / 1000.0d));
                            }
                        }
                    }
                }
                if (c357990E1t.LJ != null && !arrayList.isEmpty() && (aVMusic2 = c357990E1t.LJ) != null && (stickPointMusicAlg4 = aVMusic2.getStickPointMusicAlg()) != null && stickPointMusicAlg4.getMusicSyncPath() != null) {
                    AVMusic aVMusic3 = c357990E1t.LJ;
                    if (aVMusic3 != null) {
                        duration3 = aVMusic3.getDuration();
                    } else {
                        duration3 = 0;
                    }
                    double d = ((double) duration3) / 1000.0d;
                    C20249914Lh c20249914Lh = C20249914Lh.LIZ;
                    AVMusic aVMusic4 = c357990E1t.LJ;
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
                        AVMusic aVMusic5 = c357990E1t.LJ;
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
                            int i2 = 0;
                            for (Object obj2 : arrayList3) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    ((Number) obj2).doubleValue();
                                    if (i2 == 0) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = ((Number) ListProtector.get(arrayList3, i2 - 1)).doubleValue();
                                    }
                                    arrayList2.add(C2286608xc.LJ((int) ((((Number) ListProtector.get(arrayList3, i2)).doubleValue() - dDoubleValue) * ((double) LSPassThroughRecordSizeConfig.DEFAULT))));
                                    i2 = i3;
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
                } else {
                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                }
                if (pair == objLJFF) {
                    C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1$1");
                    return objLJFF;
                }
            } else {
                C357990E1t c357990E1t2 = this.LLILLJJLI;
                this.LL = 2;
                c357990E1t2.getClass();
                ArrayList arrayList4 = new ArrayList();
                C0E48 c0e482 = c357990E1t2.LIZJ;
                if (c0e482 != null && (tracks = C350870DpF.LJI(c0e482).getTracks()) != null) {
                    Iterator<NLETrack> it4 = tracks.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (next.getMainTrack()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null && (sortedSlots = nLETrack2.getSortedSlots()) != null) {
                        for (NLETrackSlot nLETrackSlot2 : sortedSlots) {
                            NLESegment mainSegment3 = nLETrackSlot2.getMainSegment();
                            if (mainSegment3 != null && (resource2 = mainSegment3.getResource()) != null) {
                                resourceType = resource2.getResourceType();
                            } else {
                                resourceType = null;
                            }
                            if (resourceType == NLEResType.IMAGE) {
                                arrayList4.add(new Material(EnumC2005707tP.IMAGE, 0.0d));
                            } else {
                                EnumC2005707tP enumC2005707tP2 = EnumC2005707tP.VIDEO;
                                NLESegment mainSegment4 = nLETrackSlot2.getMainSegment();
                                if (mainSegment4 != null && (resource = mainSegment4.getResource()) != null) {
                                    duration2 = resource.getDuration();
                                } else {
                                    duration2 = 0;
                                }
                                arrayList4.add(new Material(enumC2005707tP2, (duration2 / 1000.0d) / 1000.0d));
                            }
                        }
                    }
                }
                if (c357990E1t2.LJ != null && !arrayList4.isEmpty() && (aVMusic = c357990E1t2.LJ) != null && (stickPointMusicAlg = aVMusic.getStickPointMusicAlg()) != null && stickPointMusicAlg.getNoStrengthBeatsPath() != null) {
                    AVMusic aVMusic6 = c357990E1t2.LJ;
                    if (aVMusic6 != null) {
                        duration = aVMusic6.getDuration();
                    } else {
                        duration = 0;
                    }
                    double d2 = ((double) duration) / 1000.0d;
                    C20249914Lh c20249914Lh2 = C20249914Lh.LIZ;
                    AVMusic aVMusic7 = c357990E1t2.LJ;
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
                        AVMusic aVMusic8 = c357990E1t2.LJ;
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
                            int i4 = 0;
                            for (Object obj3 : arrayList6) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    ((Number) obj3).intValue();
                                    if (i4 == 0) {
                                        iIntValue = 0;
                                    } else {
                                        iIntValue = ((Number) ListProtector.get(arrayList6, i4 - 1)).intValue();
                                    }
                                    arrayList5.add(C2286608xc.LJ(((Number) ListProtector.get(arrayList6, i4)).intValue() - iIntValue));
                                    i4 = i5;
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
                                pair = new Pair(C2286608xc.LJ(0), arrayList5);
                            } else {
                                pair = new Pair(C2286608xc.LJ(0), arrayList5);
                            }
                        }
                    }
                } else {
                    pair = new Pair(C2286608xc.LJ(-1), new ArrayList());
                }
                if (pair == objLJFF) {
                    C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPointNew$1$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends List<Integer>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
