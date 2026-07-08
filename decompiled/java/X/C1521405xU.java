package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$1;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.input.BulletinEmojiButtonAssem$onViewCreated$1$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS37S0301000_2;
import kotlin.jvm.internal.AwS89S0201000_2;

/* JADX INFO: renamed from: X.05xU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1521405xU extends C09AY implements Function0<C1521305xT> {
    public C1521405xU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1521305xT invoke() {
        return new InterfaceC1521605xW() { // from class: X.05xT
            @Override // X.InterfaceC1521605xW
            public final void LIZ(UIAssem uIAssem, BulletinEmojiButtonAssem$onViewCreated$1$1 bulletinEmojiButtonAssem$onViewCreated$1$1, BulletinEmojiButtonAssem$onViewCreated$1$2 bulletinEmojiButtonAssem$onViewCreated$1$2) {
                C723850SaN.LIZLLL(uIAssem, new AwS37S0301000_2(uIAssem, bulletinEmojiButtonAssem$onViewCreated$1$1, bulletinEmojiButtonAssem$onViewCreated$1$2, 0));
            }

            @Override // X.InterfaceC1521605xW
            public final void LIZIZ(UIAssem uIAssem, RequestKeyboardAbility requestKeyboardAbility, int i) {
                C723850SaN.LIZLLL(uIAssem, new AwS89S0201000_2(uIAssem, requestKeyboardAbility, i, 0));
            }
        };
    }
}
