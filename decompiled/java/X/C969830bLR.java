package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import java.util.Map;

/* JADX INFO: renamed from: X.0bLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969830bLR {
    public static final C969810bLP LIZ = new InterfaceC1730620v8W() { // from class: X.0bLP
        public static final /* synthetic */ int LIZ = 0;

        @Override // X.InterfaceC1730620v8W
        public final void LIZ(int i, final InterfaceC969820bLQ interfaceC969820bLQ) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(i, new InterfaceC1112400f3O() { // from class: X.0bLO
                @Override // X.InterfaceC1112400f3O
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
                }

                @Override // X.InterfaceC1112400f3O
                public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                    return false;
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1112400f3O
                public final int LJIIZILJ() {
                    return 0;
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJJIIJ(C1112330f3H c1112330f3H) {
                }

                @Override // X.InterfaceC1112400f3O
                public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                    return -1;
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJJIJIIJI() {
                }

                @Override // X.InterfaceC1112400f3O
                public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                    return false;
                }

                @Override // X.InterfaceC1112400f3O
                public final int LJJIJL(CapsuleMessage capsuleMessage) {
                    return -1;
                }

                @Override // X.InterfaceC1112400f3O
                public final LiveCapsuleStyleItemConfig LJI() {
                    return C952230at3.LIZ();
                }

                @Override // X.InterfaceC1112400f3O
                public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                    return C952230at3.LIZJ();
                }

                @Override // X.InterfaceC1112400f3O
                public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                    InterfaceC969820bLQ interfaceC969820bLQ2 = interfaceC969820bLQ;
                    if (interfaceC969820bLQ2 != null) {
                        interfaceC969820bLQ2.LIZJ(((CapsuleMessage) c1112330f3H.LJIL).schema);
                        return false;
                    }
                    return false;
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJIL(C1112330f3H c1112330f3H) {
                    InterfaceC969820bLQ interfaceC969820bLQ2 = interfaceC969820bLQ;
                    if (interfaceC969820bLQ2 != null) {
                        interfaceC969820bLQ2.LIZ(((CapsuleMessage) c1112330f3H.LJIL).schema);
                    }
                }

                @Override // X.InterfaceC1112400f3O
                public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                    return C952230at3.LIZIZ(c1112330f3H);
                }

                @Override // X.InterfaceC1112400f3O
                public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
                    InterfaceC969820bLQ interfaceC969820bLQ2 = interfaceC969820bLQ;
                    if (interfaceC969820bLQ2 != null) {
                        interfaceC969820bLQ2.LIZIZ(capsuleMessage, map);
                    }
                }
            });
        }
    };
}
