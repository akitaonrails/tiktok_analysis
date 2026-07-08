package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabelKt;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Opr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel$sendRequest$2", f = "OriginMusicListViewModel.kt", l = {283}, m = "invokeSuspend")
public final class C631530Opr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C610430Nwv>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<C0O7A<C615970ODz>> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ OriginMusicListViewModel LLILZIL;
    public final /* synthetic */ C610430Nwv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631530Opr(C259800zU<C0O7A<C615970ODz>> c259800zU, boolean z, OriginMusicListViewModel originMusicListViewModel, C610430Nwv c610430Nwv, InterfaceC1364105Vn<? super C631530Opr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = z;
        this.LLILZIL = originMusicListViewModel;
        this.LLILZLL = c610430Nwv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C631530Opr c631530Opr = new C631530Opr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c631530Opr.LLILLJJLI = obj;
        return c631530Opr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c316650Cb9;
        ?? arrayList;
        EnumC631610Opz enumC631610Opz;
        boolean z;
        MusicGroup highlightedGroup;
        MusicGroup spotlightGroup;
        String str;
        String str2;
        String str3;
        ArtistHonorLabel artistHonorLabel;
        List list;
        boolean z2;
        C07X7 c07x7;
        List<MusicGroup> musicGroups;
        C1C7U.LIZ("OriginMusicListViewModel@f6d8.sendRequest$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C610420Nwu(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C610390Nwr(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C610380Nwq(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C609980NwC(this.LLILZ, this.LLILZIL, null), 3)};
            this.LL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2");
                return objLJFF;
            }
        }
        C0O7A<C615970ODz> c0o7a = this.LLILLL.element;
        if (c0o7a instanceof C0O7B) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C614090O6t c614090O6t = ((C0O7B) c0o7a).LIZLLL;
            c317290CcB.getClass();
            c316650Cb9 = new C316650Cb9(c614090O6t);
        } else if (c0o7a instanceof C0O79) {
            OriginalMusicList originalMusicList = ((C615970ODz) ((C0O79) c0o7a).LJ).LIZ;
            List<MusicGroup> musicGroups2 = originalMusicList.getMusicGroups();
            if (musicGroups2 == null) {
                musicGroups2 = C13BV.INSTANCE;
            }
            if (this.LLILZ) {
                this.LLILZIL.LLJILLL.clear();
                this.LLILZIL.LLJJI = null;
                OriginMusicListViewModel originMusicListViewModel = this.LLILZIL;
                originMusicListViewModel.LLJJJIL = 0;
                Integer honorLabel = originalMusicList.getHonorLabel();
                if (honorLabel != null) {
                    artistHonorLabel = ArtistHonorLabelKt.toArtistHonorLabel(honorLabel.intValue());
                } else {
                    artistHonorLabel = null;
                }
                originMusicListViewModel.LLJJIJIL = artistHonorLabel;
                this.LLILZIL.LLILLL = originalMusicList.getNewReleaseClipIds();
                if (musicGroups2.isEmpty()) {
                    this.LLILZIL.LLJJIII = null;
                } else if (this.LLILZIL.LLJJIII instanceof C07X7) {
                    C07X8 c07x8 = this.LLILZIL.LLJJIII;
                    if (!(c07x8 instanceof C07X7) || (c07x7 = (C07X7) c07x8) == null || (list = c07x7.LIZ) == null) {
                        list = C13BV.INSTANCE;
                    }
                    OriginMusicListViewModel originMusicListViewModel2 = this.LLILZIL;
                    List listLL = C13LP.LL(list, 5);
                    originMusicListViewModel2.getClass();
                    originMusicListViewModel2.setState(new AwS588S0100000_9(listLL, (List<InterfaceC1891350zJl>) 601));
                    OriginMusicListViewModel originMusicListViewModel3 = this.LLILZIL;
                    if (originMusicListViewModel3.LLJJIJIL == ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (originMusicListViewModel3.wQ2() && this.LLILZIL.LLJJIJIIJIL && list.isEmpty()) {
                        int i2 = C632070Oqj.LIZIZ().getInt("key_show_fan_spotlight_guide", 0);
                        long j = C632070Oqj.LIZIZ().getLong("key_last_time_show_fan_spotlight_guide", -1L);
                        long j2 = C632070Oqj.LIZIZ().getLong("key_use_fan_spotlight", -1L);
                        if (i2 < C631580Opw.LIZ().getFanSpotlightGuideMaxDisplayTime() && ((j < 0 || System.currentTimeMillis() - j > C631580Opw.LIZ().getFanSpotlightGuideDisplayInterval() * LSPassThroughRecordSizeConfig.DEFAULT) && ((j2 < 0 || System.currentTimeMillis() - j2 > C631580Opw.LIZ().getFanSpotlightGuideDisplayInterval() * LSPassThroughRecordSizeConfig.DEFAULT) && !z2))) {
                            OriginMusicListViewModel originMusicListViewModel4 = this.LLILZIL;
                            if (originMusicListViewModel4.LLILZ) {
                                originMusicListViewModel4.setState(AFwS240S0000000_9.get$arr$(898));
                            }
                        }
                    }
                    this.LLILZIL.LLJJIJIIJIL = false;
                }
                this.LLILZIL.LLJJ.clear();
                PinnedMusicList pinnedMusicList = this.LLILZIL.LLIZLLLIL;
                if (pinnedMusicList != null && (musicGroups = pinnedMusicList.getMusicGroups()) != null) {
                    Boolean.valueOf(this.LLILZIL.LLJJ.addAll(musicGroups));
                }
            }
            this.LLILZIL.LLJILLL.addAll(musicGroups2);
            if (this.LLILZLL.LIZ == this.LLILZIL.LLJJIJI && this.LLILZLL.LJFF) {
                arrayList = OriginMusicListViewModel.vQ2(this.LLILZIL, null, null, null, null, null, null, 63);
            } else {
                OriginMusicListViewModel originMusicListViewModel5 = this.LLILZIL;
                originMusicListViewModel5.getClass();
                arrayList = new ArrayList();
                ArrayList<MusicGroup> arrayList2 = new ArrayList();
                for (MusicGroup musicGroup : musicGroups2) {
                    Iterator<MusicGroup> it2 = originMusicListViewModel5.LLJJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        MusicGroup next = it2.next();
                        if (Intrinsics.LJFF(next, musicGroup)) {
                            if (next != null) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                    PinnedMusicList pinnedMusicList2 = originMusicListViewModel5.LLIZLLLIL;
                    if (pinnedMusicList2 != null) {
                        highlightedGroup = pinnedMusicList2.getHighlightedGroup();
                    } else {
                        highlightedGroup = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(highlightedGroup, musicGroup);
                    PinnedMusicList pinnedMusicList3 = originMusicListViewModel5.LLIZLLLIL;
                    if (pinnedMusicList3 != null) {
                        spotlightGroup = pinnedMusicList3.getSpotlightGroup();
                    } else {
                        spotlightGroup = null;
                    }
                    boolean zLJFF2 = Intrinsics.LJFF(spotlightGroup, musicGroup);
                    if (!z && !zLJFF && !zLJFF2) {
                        arrayList2.add(musicGroup);
                    }
                }
                for (MusicGroup musicGroup2 : arrayList2) {
                    originMusicListViewModel5.LLJJJIL++;
                    PinnedMusicList pinnedMusicList4 = originMusicListViewModel5.LLIZLLLIL;
                    if (pinnedMusicList4 != null && pinnedMusicList4.getAvalibleCapicity() > 0) {
                        enumC631610Opz = EnumC631610Opz.ENABLE_PINNED;
                    } else {
                        enumC631610Opz = EnumC631610Opz.DISABLE_PINNED;
                    }
                    C632090Oql c632090OqlLJIIL = C632050Oqh.LJIIL(musicGroup2, enumC631610Opz, null, null, null, Integer.valueOf(originMusicListViewModel5.LLJJJIL), null, null, 110);
                    if (c632090OqlLJIIL != null) {
                        arrayList.add(c632090OqlLJIIL);
                    }
                }
            }
            OriginMusicListViewModel originMusicListViewModel6 = this.LLILZIL;
            if (originMusicListViewModel6.LLJILJILJ && originMusicListViewModel6.LLJ && System.currentTimeMillis() - this.LLILZIL.LLJI > 0) {
                HashMap map = new HashMap();
                C631640Oq2 c631640Oq2 = this.LLILZIL.LLILLJJLI;
                if (c631640Oq2 != null && c631640Oq2.LIZJ) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                map.put("enter_from", str);
                C631640Oq2 c631640Oq22 = this.LLILZIL.LLILLJJLI;
                String str4 = "";
                if (c631640Oq22 == null || (str2 = c631640Oq22.LIZ) == null) {
                    str2 = "";
                }
                map.put("to_user_id", str2);
                map.put("duration", String.valueOf(System.currentTimeMillis() - this.LLILZIL.LLJI));
                C631640Oq2 c631640Oq23 = this.LLILZIL.LLILLJJLI;
                if (c631640Oq23 != null && (str3 = c631640Oq23.LIZLLL) != null) {
                    str4 = str3;
                }
                map.put("previous_page", str4);
                C20684815ws.LJIILLIIL("profile_music_tab_load_time", map);
            }
            this.LLILZIL.LLJILJILJ = false;
            if (originalMusicList.getHasMore()) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                C610430Nwv c610430Nwv = this.LLILZLL;
                c316650Cb9 = C317290CcB.LJ(c317290CcB2, null, new C610430Nwv(c610430Nwv.LIZIZ, c610430Nwv.LIZ, false, originalMusicList.getCursor(), c610430Nwv.LIZJ), arrayList, 1);
            } else {
                AbstractC316870CbV.LIZ.getClass();
                c316650Cb9 = new C316640Cb8(arrayList);
            }
        } else {
            C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
            Exception exc = new Exception();
            c317290CcB3.getClass();
            c316650Cb9 = new C316650Cb9(exc);
        }
        C1C7U.LIZIZ("OriginMusicListViewModel@f6d8.sendRequest$2");
        return c316650Cb9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<C610430Nwv>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
