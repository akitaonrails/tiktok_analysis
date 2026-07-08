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

/* JADX INFO: renamed from: X.024l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5293024l extends Message<C5293024l, C575802Mi> {
    public static final ProtoAdapter<C5293024l> ADAPTER = new ProtoAdapter<C5293024l>() { // from class: X.022t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5293024l decode(ProtoReader protoReader) {
            C5293024l c5293024l = new C5293024l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 199) {
                        if (iNextTag != 200) {
                            switch (iNextTag) {
                                case 1:
                                    c5293024l.title = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c5293024l.message = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c5293024l.dialog_type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 4:
                                    c5293024l.has_close_button = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 5:
                                    c5293024l.button_direction = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 6:
                                    c5293024l.dialog_button.add(C02HK.ADAPTER.decode(protoReader));
                                    break;
                                case 7:
                                    c5293024l.dialog_level = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 8:
                                    c5293024l.light_icon = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c5293024l.dark_icon = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c5293024l.address_location = C629302ct.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c5293024l.mask_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                        } else {
                            c5293024l.da_info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c5293024l.da_info_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5293024l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5293024l c5293024l) {
            C5293024l c5293024l2 = c5293024l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5293024l2.title) + protoAdapter.encodedSizeWithTag(2, c5293024l2.message);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5293024l2.dialog_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c5293024l2.has_close_button) + protoAdapter2.encodedSizeWithTag(5, c5293024l2.button_direction) + C02HK.ADAPTER.asRepeated().encodedSizeWithTag(6, c5293024l2.dialog_button) + protoAdapter2.encodedSizeWithTag(7, c5293024l2.dialog_level) + protoAdapter.encodedSizeWithTag(8, c5293024l2.light_icon) + protoAdapter.encodedSizeWithTag(9, c5293024l2.dark_icon) + C629302ct.ADAPTER.encodedSizeWithTag(10, c5293024l2.address_location) + protoAdapter2.encodedSizeWithTag(11, c5293024l2.mask_style) + protoAdapter2.encodedSizeWithTag(199, c5293024l2.da_info_type) + protoAdapter.encodedSizeWithTag(200, c5293024l2.da_info) + c5293024l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5293024l c5293024l) {
        }
    };
    public C629302ct address_location;
    public Integer button_direction;
    public String da_info;
    public Integer da_info_type;
    public String dark_icon;
    public List<C02HK> dialog_button;
    public Integer dialog_level;
    public Integer dialog_type;
    public Boolean has_close_button;
    public String light_icon;
    public Integer mask_style;
    public String message;
    public String title;

    public C5293024l() {
        super(ADAPTER, ByteString.EMPTY);
        this.dialog_button = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C575802Mi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
