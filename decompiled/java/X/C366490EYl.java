package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lyric.component.LyricStickerEffectUIComponent$handleEffectClick$loadJob$1", f = "LyricStickerEffectUIComponent.kt", l = {548}, m = "invokeSuspend")
public final class C366490EYl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C389110FNl LLILLJJLI;
    public final /* synthetic */ ResourceItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366490EYl(C389110FNl c389110FNl, ResourceItem resourceItem, InterfaceC1364105Vn<? super C366490EYl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389110FNl;
        this.LLILLL = resourceItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366490EYl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("LyricStickerEffectUIComponent@df9c.handleEffectClick$loadJob$1");
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
            InterfaceC366450EYh interfaceC366450EYhK5 = this.LLILLJJLI.k5();
            C389110FNl c389110FNl = this.LLILLJJLI;
            boolean z = c389110FNl.LLJILJILJ.LIZ;
            List<MusicBuzModel> listLIZIZ = C1429680nJ8.LIZIZ(c389110FNl.LLJILLL.creativeModel.musicBuzModel);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<MusicBuzModel> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(MusicBeanUtilKt.extractAVMusic(it2.next()));
            }
            ResourceItem resourceItem = this.LLILLL;
            C389110FNl c389110FNl2 = this.LLILLJJLI;
            if (c389110FNl2.LLJILJILJ.LIZ) {
                str = "edit_pro_sound";
            } else if (c389110FNl2.T2().LJIILIIL == EnumC366550EYr.STICKER_PANEL) {
                str = "edit_page_stickers";
            } else {
                str = "edit_page_music";
            }
            final C389110FNl c389110FNl3 = this.LLILLJJLI;
            C05WF c05wf = new C05WF() { // from class: X.0EYm
                @Override // X.C05WF
                public final void LIZIZ(float f, EnumC1426605iC enumC1426605iC) {
                }

                @Override // X.C05WF
                public final void LIZ(float f, String str2) {
                    c389110FNl3.N5(new C366530EYp(str2, f));
                }
            };
            this.LL = 1;
            if (interfaceC366450EYhK5.x12(z, arrayList, resourceItem, str, c05wf, this) == objLJFF) {
                C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.handleEffectClick$loadJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerEffectUIComponent@df9c.handleEffectClick$loadJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
