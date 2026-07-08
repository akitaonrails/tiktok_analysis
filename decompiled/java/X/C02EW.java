package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EW extends Message<C02EW, C02LJ> {
    public static final ProtoAdapter<C02EW> ADAPTER = new ProtoAdapter<C02EW>() { // from class: X.02EU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EW decode(ProtoReader protoReader) {
            C02EW c02ew = new C02EW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02ew.dedicated_footnote = C02EV.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ew.footnote_feed_banner = C02ES.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02ew.pending_count = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02ew.can_add_footnote = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ew;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EW c02ew) {
            C02EW c02ew2 = c02ew;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02ew2.can_add_footnote) + protoAdapter.encodedSizeWithTag(2, c02ew2.pending_count) + C02ES.ADAPTER.encodedSizeWithTag(3, c02ew2.footnote_feed_banner) + C02EV.ADAPTER.encodedSizeWithTag(4, c02ew2.dedicated_footnote) + c02ew2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EW c02ew) {
            C02EW c02ew2 = c02ew;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ew2.can_add_footnote);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ew2.pending_count);
            C02ES.ADAPTER.encodeWithTag(protoWriter, 3, c02ew2.footnote_feed_banner);
            C02EV.ADAPTER.encodeWithTag(protoWriter, 4, c02ew2.dedicated_footnote);
            protoWriter.writeBytes(c02ew2.unknownFields());
        }
    };
    public Integer can_add_footnote;
    public C02EV dedicated_footnote;
    public C02ES footnote_feed_banner;
    public Integer pending_count;

    public C02EW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
