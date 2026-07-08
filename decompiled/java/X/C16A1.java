package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16A1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16A1 extends C09AY implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
    public final /* synthetic */ DataSource LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ List<C0NPA> LLIZ;
    public final /* synthetic */ List<C0NPA> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16A1(long j, Bitmap bitmap, EasterEggForShareAssem easterEggForShareAssem, DataSource dataSource, String str, List list, List list2, List list3) {
        super(1);
        this.LL = dataSource;
        this.LLILLJJLI = easterEggForShareAssem;
        this.LLILLL = bitmap;
        this.LLILZ = str;
        this.LLILZIL = j;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = list3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
        final Function1<? super Boolean, ? extends Unit> function12 = function1;
        DataSource dataSource = this.LL;
        final EasterEggForShareAssem easterEggForShareAssem = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        final String str = this.LLILZ;
        final long j = this.LLILZIL;
        final List<String> list = this.LLILZLL;
        final List<C0NPA> list2 = this.LLIZ;
        final List<C0NPA> list3 = this.LLIZLLLIL;
        IMChatRoomAlphaVideoAbility iMChatRoomAlphaVideoAbilityHo = easterEggForShareAssem.Ho();
        if (iMChatRoomAlphaVideoAbilityHo != null) {
            iMChatRoomAlphaVideoAbilityHo.lS0(dataSource, new InterfaceC1715506nh() { // from class: X.0HAY
                public long LIZ;
                public boolean LIZIZ;

                @Override // X.InterfaceC1715506nh
                public final void LJLIIIL() {
                    Set set = (Set) easterEggForShareAssem.LLJJIII.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("high_frequency_sharing");
                    sbLIZ.append(str);
                    if (set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                        return;
                    }
                    Set set2 = (Set) easterEggForShareAssem.LLJJIII.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("high_frequency_sharing");
                    sbLIZ2.append(str);
                    set2.add(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ = System.currentTimeMillis();
                    easterEggForShareAssem.So(j, "high_frequency_sharing", str, "shown", null);
                    IMEffectNoticeViewModel iMEffectNoticeViewModelGo = easterEggForShareAssem.Go();
                    List<String> list4 = list;
                    if (!list4.isEmpty()) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(iMEffectNoticeViewModelGo), C0PEM.LIZJ, null, new C436580HAa(iMEffectNoticeViewModelGo, list4, null), 2);
                    }
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(easterEggForShareAssem);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0H63(easterEggForShareAssem, str, null), 2);
                    easterEggForShareAssem.No(Integer.valueOf(list3.size()), str, "high_frequency_sharing", list2.size() > 10 ? "full_screen" : "lighter");
                }

                @Override // X.InterfaceC1715506nh
                public final void onPlayEnd() {
                    if (this.LIZIZ) {
                        return;
                    }
                    this.LIZIZ = true;
                    easterEggForShareAssem.Oo(this.LIZ, "high_frequency_sharing", str);
                    function12.invoke(Boolean.TRUE);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(easterEggForShareAssem), C0PEM.LIZJ, null, new C436710HAn(easterEggForShareAssem, list3, null), 2);
                }
            }, C2097908Jt.LIZJ(new Pair("sharingspree", bitmap)), true, null);
        }
        return Unit.LIZ;
    }
}
