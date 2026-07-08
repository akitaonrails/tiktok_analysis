package X;

import android.content.Context;
import android.provider.MediaStore;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS70S0500000_8;

/* JADX INFO: renamed from: X.0oBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463330oBP implements InterfaceC1463310oBN {
    @Override // X.InterfaceC1463310oBN
    public final void LIZIZ(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        C1420960n54.LIZ.getClass();
        C1420960n54.LIZLLL(iFetchResourcesListener);
    }

    @Override // X.InterfaceC1463310oBN
    public final void LIZ(final int i, final long j, final Context context, final AVMusic aVMusic, final IMusicRequestParam iMusicRequestParam, final InterfaceC1455230nyL interfaceC1455230nyL, final InterfaceC1463380oBU interfaceC1463380oBU, final String str, final String str2, final AwS70S0500000_8 awS70S0500000_8, final Function0 function0) {
        C1420960n54 c1420960n54 = C1420960n54.LIZ;
        IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = new IFoundationAVService.IFetchResourcesListener() { // from class: X.0oBQ
            public final /* synthetic */ C1444840nha LIZJ = C1444840nha.LIZ;

            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
            public final void onFailed(Exception exc) {
                InterfaceC1463380oBU interfaceC1463380oBU2 = interfaceC1463380oBU;
                if (interfaceC1463380oBU2 != null) {
                    interfaceC1463380oBU2.LJI(exc);
                }
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.0oBR] */
            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
            public final void onSuccess(String[] strArr) {
                InterfaceC1463380oBU interfaceC1463380oBU2 = interfaceC1463380oBU;
                if (interfaceC1463380oBU2 != null) {
                    interfaceC1463380oBU2.LJIIIZ();
                }
                AVMusic aVMusic2 = aVMusic;
                if (aVMusic2 != null) {
                    C1444820nhY.LJII(aVMusic2);
                    InterfaceC1463380oBU interfaceC1463380oBU3 = interfaceC1463380oBU;
                    if (interfaceC1463380oBU3 != null) {
                        interfaceC1463380oBU3.LIZJ(aVMusic, EnumC1463370oBT.MUSIC_FROM_RESUME);
                    }
                    C1444840nha c1444840nha = this.LIZJ;
                    Context context2 = context;
                    AVMusic aVMusic3 = aVMusic;
                    final InterfaceC1463380oBU interfaceC1463380oBU4 = interfaceC1463380oBU;
                    C1420820n4q c1420820n4q = new C1420820n4q() { // from class: X.0oBV
                        @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                        public final void LIZ() {
                            InterfaceC1463380oBU interfaceC1463380oBU5 = interfaceC1463380oBU4;
                            if (interfaceC1463380oBU5 != null) {
                                interfaceC1463380oBU5.LJIIIIZZ(EnumC1463370oBT.MUSIC_FROM_RESUME);
                            }
                        }

                        @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                        public final void LIZJ(AVMusic aVMusic4, boolean z) {
                            if (z) {
                                InterfaceC1463380oBU interfaceC1463380oBU5 = interfaceC1463380oBU4;
                                if (interfaceC1463380oBU5 != null) {
                                    interfaceC1463380oBU5.LIZLLL(aVMusic4, EnumC1463370oBT.MUSIC_FROM_RESUME);
                                    return;
                                }
                                return;
                            }
                            InterfaceC1463380oBU interfaceC1463380oBU6 = interfaceC1463380oBU4;
                            if (interfaceC1463380oBU6 == null) {
                                return;
                            }
                            interfaceC1463380oBU6.LJIIJ(aVMusic4, EnumC1463370oBT.MUSIC_FROM_RESUME);
                        }

                        @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                        public final void LIZLLL(AVMusic aVMusic4, boolean z) {
                            if (z) {
                                InterfaceC1463380oBU interfaceC1463380oBU5 = interfaceC1463380oBU4;
                                if (interfaceC1463380oBU5 != null) {
                                    interfaceC1463380oBU5.LIZIZ(aVMusic4, EnumC1463370oBT.MUSIC_FROM_RESUME);
                                    return;
                                }
                                return;
                            }
                            InterfaceC1463380oBU interfaceC1463380oBU6 = interfaceC1463380oBU4;
                            if (interfaceC1463380oBU6 == null) {
                                return;
                            }
                            interfaceC1463380oBU6.LJFF(aVMusic4, EnumC1463370oBT.MUSIC_FROM_RESUME);
                        }
                    };
                    c1444840nha.getClass();
                    C1420960n54.LIZ.getClass();
                    C1420960n54.LIZJ(context2, aVMusic3, c1420820n4q);
                    return;
                }
                final C1444840nha c1444840nha2 = this.LIZJ;
                final int i2 = i;
                String str3 = str;
                long j2 = j;
                Function0<String> function02 = awS70S0500000_8;
                Function0<String> function03 = function0;
                String str4 = str2;
                IMusicRequestParam iMusicRequestParam2 = iMusicRequestParam;
                final InterfaceC1463380oBU interfaceC1463380oBU5 = interfaceC1463380oBU;
                final Context context3 = context;
                final ?? r1 = new InterfaceC1463460oBc() { // from class: X.0oBR
                    public final void LIZIZ() {
                        InterfaceC1463380oBU interfaceC1463380oBU6 = interfaceC1463380oBU5;
                        if (interfaceC1463380oBU6 != null) {
                            interfaceC1463380oBU6.LJII();
                        }
                    }

                    @Override // X.InterfaceC1463460oBc
                    public final void onFailed(Exception exc) {
                        InterfaceC1463380oBU interfaceC1463380oBU6 = interfaceC1463380oBU5;
                        if (interfaceC1463380oBU6 != null) {
                            interfaceC1463380oBU6.LIZ(exc);
                        }
                    }

                    @Override // X.InterfaceC1463460oBc
                    public final void LIZ(List<? extends AVMusic> list, final EnumC1463370oBT enumC1463370oBT) {
                        AVMusic aVMusic4;
                        AVMusic aVMusic5 = null;
                        if (C580130Mp9.LIZ(list)) {
                            InterfaceC1463380oBU interfaceC1463380oBU6 = interfaceC1463380oBU5;
                            if (interfaceC1463380oBU6 != null) {
                                interfaceC1463380oBU6.LIZ(null);
                                return;
                            }
                            return;
                        }
                        InterfaceC1463380oBU interfaceC1463380oBU7 = interfaceC1463380oBU5;
                        if (interfaceC1463380oBU7 != null) {
                            interfaceC1463380oBU7.LJ(list);
                        }
                        InterfaceC1463380oBU interfaceC1463380oBU8 = interfaceC1463380oBU5;
                        if (interfaceC1463380oBU8 != null) {
                            if (list != null) {
                                aVMusic4 = (AVMusic) ListProtector.get(list, 0);
                            } else {
                                aVMusic4 = null;
                            }
                            interfaceC1463380oBU8.LIZJ(aVMusic4, enumC1463370oBT);
                        }
                        C1444840nha c1444840nha3 = c1444840nha2;
                        Context context4 = context3;
                        if (list != null) {
                            aVMusic5 = (AVMusic) ListProtector.get(list, 0);
                        }
                        final InterfaceC1463380oBU interfaceC1463380oBU9 = interfaceC1463380oBU5;
                        C1420820n4q c1420820n4q2 = new C1420820n4q() { // from class: X.0oBW
                            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                            public final void LIZ() {
                                InterfaceC1463380oBU interfaceC1463380oBU10 = interfaceC1463380oBU9;
                                if (interfaceC1463380oBU10 != null) {
                                    interfaceC1463380oBU10.LJIIIIZZ(enumC1463370oBT);
                                }
                            }

                            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                            public final void LIZJ(AVMusic aVMusic6, boolean z) {
                                if (z) {
                                    InterfaceC1463380oBU interfaceC1463380oBU10 = interfaceC1463380oBU9;
                                    if (interfaceC1463380oBU10 != null) {
                                        interfaceC1463380oBU10.LIZLLL(aVMusic6, enumC1463370oBT);
                                        return;
                                    }
                                    return;
                                }
                                InterfaceC1463380oBU interfaceC1463380oBU11 = interfaceC1463380oBU9;
                                if (interfaceC1463380oBU11 == null) {
                                    return;
                                }
                                interfaceC1463380oBU11.LJIIJ(aVMusic6, enumC1463370oBT);
                            }

                            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                            public final void LIZLLL(AVMusic aVMusic6, boolean z) {
                                if (z) {
                                    InterfaceC1463380oBU interfaceC1463380oBU10 = interfaceC1463380oBU9;
                                    if (interfaceC1463380oBU10 != null) {
                                        interfaceC1463380oBU10.LIZIZ(aVMusic6, enumC1463370oBT);
                                        return;
                                    }
                                    return;
                                }
                                InterfaceC1463380oBU interfaceC1463380oBU11 = interfaceC1463380oBU9;
                                if (interfaceC1463380oBU11 == null) {
                                    return;
                                }
                                interfaceC1463380oBU11.LJFF(aVMusic6, enumC1463370oBT);
                            }
                        };
                        c1444840nha3.getClass();
                        C1420960n54.LIZ.getClass();
                        C1420960n54.LIZJ(context4, aVMusic5, c1420820n4q2);
                    }
                };
                final InterfaceC1455230nyL interfaceC1455230nyL2 = interfaceC1455230nyL;
                c1444840nha2.getClass();
                r1.LIZIZ();
                C15O7.LIZJ(new Callable(i2, str3, j2, function02, function03, str4, iMusicRequestParam2) { // from class: X.0msT
                    public final /* synthetic */ int LL;
                    public final /* synthetic */ String LLILLJJLI;
                    public final /* synthetic */ Function0<String> LLILLL;
                    public final /* synthetic */ Function0<String> LLILZ;
                    public final /* synthetic */ IMusicRequestParam LLILZIL;

                    {
                        this.LLILLL = function02;
                        this.LLILZ = function03;
                        this.LLILZIL = iMusicRequestParam2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Pair pair;
                        C1C7U.LIZ("StickPointManager@306e.getStickPointMusicList$1");
                        try {
                            pair = C1403010mc7.LIZ.getMusicService().il(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
                            if (pair == null) {
                                pair = new Pair(null, null);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1441170nbf.LIZ.getClass();
                            C1441170nbf.LJ(false, e);
                            pair = new Pair(null, null);
                        }
                        Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
                        C1C7U.LIZIZ("StickPointManager@306e.getStickPointMusicList$1");
                        return pair2;
                    }
                }).LJ(new InterfaceC2385309Wh() { // from class: X.0oBS
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        MusicBuzModel musicBuzModelLIZIZ;
                        ArrayList arrayList;
                        C1C7U.LIZ("StickPointManager@306e.getStickPointMusicList$2");
                        if (c15o7 != null && c15o7.LJIIL() != null) {
                            Collection collection = (Collection) ((Pair) c15o7.LJIIL()).getFirst();
                            if (collection != null && !collection.isEmpty()) {
                                Collection collection2 = (Collection) ((Pair) c15o7.LJIIL()).getFirst();
                                if (collection2 != null) {
                                    ArrayList arrayList2 = new ArrayList(collection2);
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        C1444820nhY.LJII((AVMusic) it2.next());
                                    }
                                    InterfaceC1463460oBc interfaceC1463460oBc = r1;
                                    if (interfaceC1463460oBc != null) {
                                        C1444840nha c1444840nha3 = c1444840nha2;
                                        int i3 = i2;
                                        InterfaceC1455230nyL interfaceC1455230nyL3 = interfaceC1455230nyL2;
                                        c1444840nha3.getClass();
                                        if (interfaceC1455230nyL3 != null) {
                                            musicBuzModelLIZIZ = interfaceC1455230nyL3.LIZIZ();
                                        } else {
                                            musicBuzModelLIZIZ = null;
                                        }
                                        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModelLIZIZ);
                                        if (aVMusicExtractAVMusic == null) {
                                            if (C580130Mp9.LIZ(arrayList2)) {
                                                arrayList = null;
                                            } else {
                                                arrayList = new ArrayList(C1444840nha.LIZ(i3, arrayList2));
                                            }
                                        } else {
                                            C1444820nhY.LJII(aVMusicExtractAVMusic);
                                            if (C580130Mp9.LIZ(arrayList2)) {
                                                arrayList = new ArrayList();
                                            } else {
                                                Iterator it3 = arrayList2.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        break;
                                                    }
                                                    AVMusic aVMusic4 = (AVMusic) it3.next();
                                                    if (aVMusic4.getId() == aVMusicExtractAVMusic.getId()) {
                                                        arrayList2.remove(aVMusic4);
                                                        break;
                                                    }
                                                }
                                                arrayList = new ArrayList(C1444840nha.LIZ(i3, arrayList2));
                                            }
                                            String str5 = aVMusicExtractAVMusic.path;
                                            if (str5 != null && !str5.startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString()) && !str5.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !str5.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString())) {
                                                ListProtector.add(arrayList, 0, aVMusicExtractAVMusic);
                                            }
                                        }
                                        interfaceC1463460oBc.LIZ(arrayList, (EnumC1463370oBT) ((Pair) c15o7.LJIIL()).getSecond());
                                    }
                                    C1441170nbf.LIZ.getClass();
                                    C1441170nbf.LJ(true, null);
                                }
                            } else {
                                InterfaceC1463460oBc interfaceC1463460oBc2 = r1;
                                if (interfaceC1463460oBc2 != null) {
                                    interfaceC1463460oBc2.onFailed(new Exception());
                                }
                            }
                        } else {
                            InterfaceC1463460oBc interfaceC1463460oBc3 = r1;
                            if (interfaceC1463460oBc3 != null) {
                                interfaceC1463460oBc3.onFailed(new Exception());
                            }
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("StickPointManager@306e.getStickPointMusicList$2");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            }
        };
        c1420960n54.getClass();
        C1420960n54.LIZLLL(iFetchResourcesListener);
    }
}
