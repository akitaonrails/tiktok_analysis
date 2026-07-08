package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.023J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023J extends Message<C023J, C02O7> {
    public static final ProtoAdapter<C023J> ADAPTER = new ProtoAdapter<C023J>() { // from class: X.022I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023J decode(ProtoReader protoReader) {
            C023J c023j = new C023J();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c023j.exception_ux_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c023j.render_page = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c023j.dialog_content = C5293024l.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c023j.toast_content = C02A8.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c023j.verification_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c023j.redirect_content = C641102en.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c023j.input_box_hint_content_list.add(C02G9.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c023j.screen_content = C551202Cw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c023j.anchor_module = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c023j.toko_toast_content = C761002y8.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c023j.exception_info = C640502eh.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c023j.trigger_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023J c023j) {
            C023J c023j2 = c023j;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023j2.exception_ux_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c023j2.render_page) + C5293024l.ADAPTER.encodedSizeWithTag(3, c023j2.dialog_content) + C02A8.ADAPTER.encodedSizeWithTag(4, c023j2.toast_content);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c023j2.verification_content) + C641102en.ADAPTER.encodedSizeWithTag(6, c023j2.redirect_content) + C02G9.ADAPTER.asRepeated().encodedSizeWithTag(7, c023j2.input_box_hint_content_list) + C551202Cw.ADAPTER.encodedSizeWithTag(8, c023j2.screen_content) + protoAdapter2.encodedSizeWithTag(9, c023j2.anchor_module) + C761002y8.ADAPTER.encodedSizeWithTag(10, c023j2.toko_toast_content) + C640502eh.ADAPTER.encodedSizeWithTag(11, c023j2.exception_info) + protoAdapter.encodedSizeWithTag(12, c023j2.trigger_type) + c023j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023J c023j) {
        }
    };
    public String anchor_module;
    public C5293024l dialog_content;
    public C640502eh exception_info;
    public Integer exception_ux_type;
    public List<C02G9> input_box_hint_content_list;
    public C641102en redirect_content;
    public Boolean render_page;
    public C551202Cw screen_content;
    public C02A8 toast_content;
    public C761002y8 toko_toast_content;
    public Integer trigger_type;
    public String verification_content;

    public C023J() {
        super(ADAPTER, ByteString.EMPTY);
        this.input_box_hint_content_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02O7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
