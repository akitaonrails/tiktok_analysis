package X;

import com.ss.android.ugc.aweme.music.api.MusicDetailApiV2;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS117S0101000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel$collectMusic$1", f = "MusicCollectViewModel.kt", l = {122}, m = "invokeSuspend")
public final class C616480OFy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicCollectViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616480OFy(MusicCollectViewModel musicCollectViewModel, int i, InterfaceC1364105Vn<? super C616480OFy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicCollectViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C616480OFy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicCollectViewModel@9ef2.collectMusic$1");
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
            C0OG3 c0og3 = MusicDetailApiV2.LIZ;
            final String str = this.LLILLJJLI.LL;
            if (str != null) {
                int i2 = this.LLILLL;
                c0og3.getClass();
                C087R.LIZ.getClass();
                C087R.LIZJ();
                C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0OG1(str, i2));
                C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str) { // from class: X.0O7p
                    public final String LIZIZ;
                    public final C614260O7k LIZJ;

                    @Override // X.InterfaceC614350O7t
                    public final String LIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.AbstractC614210O7f
                    public final AbstractC614250O7j LIZIZ() {
                        return this.LIZJ;
                    }

                    {
                        this.LIZIZ = str;
                        C614260O7k c614260O7k = C614260O7k.LIZIZ;
                        c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                        this.LIZJ = c614260O7k;
                    }
                });
                CollectMusicResponse collectMusicResponse = new CollectMusicResponse();
                collectMusicResponse.action = i2;
                C0O7F.LJFF(c613960O6gLIZ, new C0OG0(collectMusicResponse));
                InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZ.LIZIZ();
                final MusicCollectViewModel musicCollectViewModel = this.LLILLJJLI;
                final int i3 = this.LLILLL;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0OFz
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        C0O7A c0o7a = (C0O7A) obj2;
                        if (c0o7a instanceof C0O79) {
                            CollectMusicResponse collectMusicResponse2 = ((C0OG0) ((C0O79) c0o7a).LJ).LIZ;
                            if (collectMusicResponse2 != null) {
                                musicCollectViewModel.setState(new AwS117S0101000_9(i3, collectMusicResponse2, 10));
                            }
                        } else if (c0o7a instanceof C0O78) {
                            musicCollectViewModel.setState(new AwS588S0100000_9(c0o7a, (C0O7A<C615690OCx>) 579));
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectViewModel@9ef2.collectMusic$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectViewModel@9ef2.collectMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
